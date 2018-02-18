import java.util.*;

public class Blackjack {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		P1Random rng = new P1Random();
		int m = 1;

		int choice = 1;
		int p1win = 0;
		int deawin = 0;
		int games = 0;
		int tie = 0;
		while (choice <= 4) {
			System.out.println("START GAME #" + m + "\n");
			m++;

			int z = 0;
			boolean looping = true;

			while (looping) {

				int myNumber = rng.nextInt(13) + 1;
				if (myNumber == 1) {
					System.out.println("Your card is a ACE!");
				}

				else if (myNumber == 11) {
					myNumber = 10;
					System.out.println("Your card is a JACK!");
				}

				else if (myNumber == 12) {
					myNumber = 10;
					System.out.println("Your card is a QUEEN!");
				}

				else if (myNumber == 13) {
					myNumber = 10;
					System.out.println("Your card is a KING!");
				}

				else {
					System.out.println("Your card is a " + myNumber + "!");
				}

				z += myNumber;

				if (z == 21) {
					System.out.println("Your hand is: " + z + "\n");
					System.out.println("BLACKJACK! You win!\n");
					p1win++;
					games++;
					break;

				} else if (z > 21) {
					System.out.println("Your hand is: " + z + "\n");
					System.out.println("You exceeded 21! You lose.\n");
					deawin++;
					games++;
					break;
				} else {
					System.out.println("Your hand is: " + z + "\n");
				}
				boolean lol = true;

				while (lol) {
					System.out.println("1. Get another card");
					System.out.println("2. Hold hand");
					System.out.println("3. Print statistics");
					System.out.println("4. Exit\n");
					System.out.print("Choose an option: ");

					choice = x.nextInt();
					System.out.println();

					int deNumber;
					if (choice == 2) {

						deNumber = rng.nextInt(11) + 16;

						System.out.println("Dealer's hand: " + deNumber);
						System.out.println("Your hand is: " + z + "\n");

						looping = false;

						if (z == deNumber) {
							System.out.println("It's a tie! No one wins!\n");
							tie++;
							games++;
							break;

						} else if (deNumber > 21) {
							System.out.println("You win!");
							System.out.println();
							p1win++;
							games++;
							break;
						}
						if (deNumber == 21 || deNumber > z) {
							System.out.println("Dealer wins!\n");
							deawin++;
							games++;
						}
						// else if (deNumber > z) {
						// System.out.println("Dealer wins!\n");
						// deawin++;
						// break;
						// }
					}
					if (choice == 4) {
						System.exit(0);

					}

					if (choice > 4 || choice < 1) {
						System.out.println("Invalid input!");
						System.out.println("Please enter an integer value between 1 and 4.\n");

					}

					if (choice == 3) {

						System.out.println("Number of Player wins: " + p1win);
						System.out.println("Number of Dealer wins: " + deawin);
						System.out.println("Number of tie games: " + tie);
						System.out.println("Total # of games played is: " + games);
						double perc = (double) (p1win) / games * 100;
						System.out.println("Percentage of Player wins: " + perc + "%\n");
					}

					if (choice == 1 || choice == 4 || choice == 2) {
						lol = false;
					}
				}
			}

		}
	}

}
