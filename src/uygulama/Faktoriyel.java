package uygulama;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Faktoriyeli alınmasını istediğiniz sayıyı giriniz :");
		int number = scan.nextInt();
		System.out.print(number + " faktoriyel =");
		int result = 1;

		while (number > 0) {

			result *= number;

			--number;

		}
		System.out.println(result);

	}

}
