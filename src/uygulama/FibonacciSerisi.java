package uygulama;

import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ka� Adet Fibonnacci Say�s� G�rmek �stiyorsunuz?");
		int number = scan.nextInt();

		int first = 0;
		int second = 1;
		int third = first + second;

		System.out.println("Fibonacci Say�lar� ");

		if (number < 2) {
			System.out.println(first + " ");
		} else {
			System.out.print(first + " " + second + " ");
		}

		while (number - 2 > 0) {
			System.out.print(third + " ");
			number--;
			first = second;
			second = third;
			third = first + second;

		}

	}

}
