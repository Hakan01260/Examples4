package uygulama;

import java.util.regex.*;

public class HarfHariciBulma {

	static void splitString(String str) {

		// StringBuffer class'ý mutable (deðiþtirilebilir) stringler yaratmak için kullanýlýr.
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));
		}

		System.out.println("Number :" + num);
		System.out.println("Special :" + special);
	}

	// Driver method
	public static void main(String args[]) {
		String str = "hakan01$$for02erdo03!@!!";
		splitString(str);
	}
}
