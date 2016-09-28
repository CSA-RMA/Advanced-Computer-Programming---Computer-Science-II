/*
Connor A. Peterson
Howard Davis
5/6/16
v1.0 Later updates to come.
*/
package hotel;
import java.io.*;
import java.text.*;
import java.util.*;
class Room //Easier to put the classes here since I can easily access them and change if something is wrong. I know you don't like it but oh well.
{
    private String size;
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Date> bookings = new ArrayList<Date>();
    Room(String size, ArrayList<Customer> customers, ArrayList<Date> bookings)
    {
        this.size=size;
        this.customers=customers;
        this.bookings=bookings;
    }
    
    public String toString()
    {
        String toString=this.size;
        for(int i=0;i<customers.size();i++)
        {
            toString+=" booked by "+customers.get(i).getName()+" during "+this.bookings.get(i*2)+" - "+this.bookings.get(i*2+1);
        }
        return toString;
    }
    
    public ArrayList<Customer> returnCustomers() 
    {
        return this.customers;
    }
    
    public ArrayList<Date> returnBookings() 
    {
        return this.bookings;
    }
    
    public String returnSize()
    {
        return this.size;
    }
}
class Customer 
{
    private String name;
    private int room;
    private Date indate;
    private Date outdate;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }
    
    public int getRoom()
    {
        return this.room;
    }
    
    public Date getInDate()
    {
        return this.indate;
    }
    
    public Date getOutDate()
    {
        return this.outdate;
    }
    
    /*public void setRoom(int room)
    {
        this.room=room;
    }*/
    
    public void bookRoom(String name, int room, Date indate, Date outdate)
    {
        this.name=name;
        this.room=room;
        this.indate=indate;
        this.outdate=outdate;
    }
    
}

class Hotel
{
    public static ArrayList initialize(File file) throws FileNotFoundException, ParseException
    {
        ArrayList<Room> roomList=new ArrayList<Room>();
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine())
        {
            String[] parts = reader.nextLine().split("\t");
            Date indate;
            Date outdate;
            ArrayList<Date> bookings = new ArrayList<Date>();
            ArrayList<Customer> customers = new ArrayList<Customer>();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyyhh:mm");
            for(int i=0;i<parts.length/3;i++)
            {
                String[] partsparts = parts[i+2].split("-");
                indate = dateFormat.parse(partsparts[0]);
                outdate = dateFormat.parse(partsparts[1]);
                Customer customer = new Customer();
                customer.bookRoom(parts[i+1], i, indate, outdate);
                bookings.add(indate);
                bookings.add(outdate);
                customers.add(customer);
            }
            Room room = new Room(parts[0], customers, bookings);
            roomList.add(room);
        }
        return roomList;
    }

    public static void viewList(ArrayList<Room> roomList)
    {
        int i=1;
        for (Room roomList1 : roomList) {
            if(!roomList1.returnCustomers().isEmpty()) {
                for(int o=0;o<roomList1.returnCustomers().size();o++) {
                    System.out.println("Room number "+i+" is booked by "+roomList1.returnCustomers().get(o).getName()+" during "+roomList1.returnBookings().get(o*2)+" - "+roomList1.returnBookings().get(o*2+1));
                }
            } else {
                System.out.println("Room number "+i+" is not booked.");
            }
            i++;
        }
        System.out.println();
    }

    public static boolean addCustomer(ArrayList<Room> roomList, String roomsize, Customer customer, Date indate, Date outdate)
    {
        for (int i=0; i<roomList.size(); i++) {
            Room roomList1=roomList.get(i);
            if (roomList1.returnCustomers().isEmpty() && roomList1.returnSize().equals(roomsize)) {
                roomList1.returnCustomers().add(customer);
                roomList1.returnBookings().add(indate);
                roomList1.returnBookings().add(outdate);
                return true;
            } 
            for(int o=0; o<roomList1.returnBookings().size()/2;o++) {
                if (indate.after(roomList1.returnBookings().get(o*2+1))&&outdate.after(roomList1.returnBookings().get(o*2+1))||indate.before(roomList1.returnBookings().get(o*2))&&outdate.before(roomList1.returnBookings().get(o*2))) {
                    roomList1.returnCustomers().add(customer);
                    roomList1.returnBookings().add(indate);
                    roomList1.returnBookings().add(outdate);
                    return true;
                }
            }
        }
        return false;
    }

    public static void showEmptyRooms(ArrayList<Room> roomList)
    {
        int i=1;
        System.out.println("All available rooms are:");
        for (Room roomList1 : roomList) {
            if (roomList1.returnCustomers().isEmpty()) {
                System.out.println("Room "+i+": "+roomList1);
            }
            i++;
        }
        System.out.println();
    }

    public static boolean deleteCustomer(ArrayList<Room> roomList, String name)
    {
        for (Room roomList1 : roomList) {
            for(int i=0;i<roomList1.returnCustomers().size();i++) {
                if (roomList1.returnCustomers().get(i).getName().equals(name)) {
                    roomList1.returnCustomers().remove(i);
                    roomList1.returnBookings().remove(i*2);
                    roomList1.returnBookings().remove(i*2+1);
                    System.out.println("Person was removed and the room is now open.\n");
                    return true;
                }
            }
        }
        return false;
    }

    public static int getIndex(ArrayList<Room> roomList, String name)
    {
        for(int i=0; i<roomList.size(); i++)
            for(int o=0;o<roomList.get(i).returnCustomers().size();o++) {
                if (roomList.get(i).returnCustomers().get(i).getName().equals(name)) {
                    return i;
                }
            }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException
    {
        File file = new File("rooms.txt");
        String name;
        ArrayList<Room> roomList = initialize(file);
        Scanner input = new Scanner(System.in);
        String option;
        System.out.println("Don't forget you can type '?' and see the available options!");

        do // Did switch cause netbeans was like you should do it this way instead, hasnt caused issues but will change back to if's if it does cause an issue later.
        {
            System.out.print("HRS--->");
            option = input.nextLine();
            System.out.println();

            switch(option) 
            {
                case "?":
                {
                    System.out.println("=====================================");
                    System.out.println("|       Hotel Booking Options       |");
                    System.out.println("=====================================");
                    System.out.println("|1: To View all rooms               |");
                    System.out.println("|2: To book a room                  |");
                    System.out.println("|3: To Display empty rooms          |");
                    System.out.println("|4: To Delete customer from a room  |");
                    System.out.println("|5: Find room from customer name    |");
                    System.out.println("|0: Exit                            |");
                    System.out.println("=====================================");
                    break;
                }
                case "1":
                {
                    viewList(roomList);
                    break;
                }
                case "2":
                {
                    System.out.print("Please enter your name for the room to be listed under: ");
                    name=input.nextLine(); //Capitalization does matter for this not when making the name for the first available room but for option 5 when searching for a name to find the room.
                    name=name.toUpperCase();
                    Customer customer = new Customer();
                    customer.setName(name);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy hh:mm");
                    System.out.println("Please enter the time you want to rent a room at in the format of \ndd/MMM/yyyy hh:mm - dd/MMM/yyyy hh:mm \n(i.e. 12/MAR/2012 09:30 - 15/MAR/2012 09:30): ");
                    String date = input.nextLine();
                    String[] partsparts = date.split("-");
                    Date indate = dateFormat.parse(partsparts[0]);
                    Date outdate = dateFormat.parse(partsparts[1]);
                    System.out.println("What size room is being booked?");
                    System.out.println("King bed: $350 \nQueen bed: $250 \nSingle bed: $100 \nDouble bed: $175");
                    System.out.println("HRS--->");
                    String roomsize = input.nextLine();
                    roomsize=roomsize.toLowerCase();
                    if(!addCustomer(roomList, roomsize, customer, indate, outdate)){
                        System.out.println("No rooms available!");
                        break;
                    }
                    if (roomsize.equals("king")){
                        System.out.println("You have booked a King sized room for $350!");
                        break;
                    }
                    if (roomsize.equals("queen")){
                        System.out.println("You have booked a Queen sized room for $250!");
                        break;
                    }
                    if (roomsize.equals("single")){
                        System.out.println("You have booked a Single bed room for $100!");
                        break;
                    }
                    if (roomsize.equals("double")){
                        System.out.println("You have booked a room with Double beds for $175!");
                        break;
                    }
                    else{
                        System.out.println("Invalid input returning to home.");
                        break;
                    }
                }
                case "3":
                {
                    showEmptyRooms(roomList);
                    break;
                }
                case "4":
                {
                    System.out.print("Customer's name: ");
                    name=input.nextLine();
                    System.out.println();
                    deleteCustomer(roomList, name);
                    break;
                }
                case "5":
                {
                    System.out.print("Customer's name: "); //Name must be entered as it was earlier if not it will crash Ex. Derrick is put as the name then searched as derrick it will crashh since "Derrick" wasnt found.
                    name=input.nextLine();
                    System.out.println();
                    System.out.println("Customer's room: "+roomList.get(getIndex(roomList, name))+"\n");
                    break;
                }
                case "0":
                {
                    System.out.println("\nThank you!\n");
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Invalid option!\n");
                    break;
                }
            }


        }while(!"noentry".equals(option));
    }
}


