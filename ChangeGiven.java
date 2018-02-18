import java.util.Scanner;
public class ChangeGiven {

	public static void main (String args[]) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an amount in double, for example 11.56: \n");
		
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickles = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consist of ");
		System.out.println("    " + numberOfOneDollars + " dolllars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickles + " nickles");
		System.out.println("    " + numberOfPennies + " pennies");
		
		}	
}
