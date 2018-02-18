import java.util.*;

public class Main {

	public static long hexa_de32bits(String n) {
		long suma = 0;
		String num = n;
		if (num.substring(0, 2).equals("0X")) {
			num = num.substring(2);
		}

		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) == 'A') {
				suma += 10 * (Math.pow(16, num.length() - 1 - i));
			} else if (num.charAt(i) == 'B')
				suma += 11 * (Math.pow(16, num.length() - 1 - i));
			else if (num.charAt(i) == 'C')
				suma += 12 * (Math.pow(16, num.length() - 1 - i));
			else if (num.charAt(i) == 'D')
				suma += 13 * (Math.pow(16, num.length() - 1 - i));
			else if (num.charAt(i) == 'E')
				suma += 14 * (Math.pow(16, num.length() - 1 - i));
			else if (num.charAt(i) == 'F')
				suma += 15 * (Math.pow(16, num.length() - 1 - i));
			else {
				suma += Integer.parseInt("" + num.charAt(i)) * (long) Math.pow(16, num.length() - 1 - i);
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a hexadecimal number: ");
		String numero = x.nextLine().toUpperCase();
		System.out.println("Your number is " + hexa_de32bits(numero) + " in decimal");
	}
}
