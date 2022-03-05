package uygulama;

import java.util.Scanner;

public class CarpýmToblosu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Çarpým tablosunu istediðiniz sayýyý girin :");
		int number = scan.nextInt();

		for (int i = 0; i <= 10; i++) {

			System.out.println(number * i);

		}
	}
}
