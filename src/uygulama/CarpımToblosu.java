package uygulama;

import java.util.Scanner;

public class Carp�mToblosu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�arp�m tablosunu istedi�iniz say�y� girin :");
		int number = scan.nextInt();

		for (int i = 0; i <= 10; i++) {

			System.out.println(number * i);

		}
	}
}
