public class BevoCard {
    private double balance;

    public BevoCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
        if(amount<=balance) { // the method checks if the balance of the card is at least the amount given as parameter
            balance=balance-amount;
            return true; // if the balance is enough, the given amount is taken from the balance and true is returned
       }
       return false; // if not, the method returns false meaning that the card could not be used for the payment
    }
    static void main(String[] args) {
        BevoCard cardOfPekka = new BevoCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );
    }
}