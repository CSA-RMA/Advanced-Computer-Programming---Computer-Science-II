import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		System.out.printf("Please enter your name: ");
		String name=user_input.nextLine();
		System.out.printf("Greetings, O Honorable %s the Magnificent!  May I kiss your signet ring?",name);
	}
}