import java.util.Scanner;

public class Main2 {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);

		System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
		int y = x.nextInt();
		if (y <= 0) {
			System.out.print("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!\n");
			System.exit(0);
		}

		System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
		double m = x.nextDouble();
		if (m <= 0 || m > 100) {
			System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
			System.exit(0);
		}

		System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
		double g = x.nextDouble();

		if (g < 0 || g > 100) {
			System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
			System.exit(0);
		}

		int rawRange = (int) (y * m * (g * 0.01));

		if (rawRange <= 25) {
			System.out.print("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
		}
		if (rawRange > 25) {
			System.out.print("Keep driving! Your current estimated range is: " + rawRange + " miles!");
		}
	}
}
