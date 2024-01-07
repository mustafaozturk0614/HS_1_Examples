package com.bilgeadam.lesson001;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		System.out.println("Program başladı");

		// scanner olusturdum
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir sayi giriniz");

		int sayi1 = scanner.nextInt();

		System.out.println("sayi1==>" + sayi1);

		System.out.println("Lütfen long bir değer giriniz");
		// scanner.nextLine();
		long sayi2 = scanner.nextLong();

		System.out.println("sayi2==>" + sayi2);
		System.out.println("Lütfen double bir değer giriniz");
		double sayi3 = scanner.nextDouble();

		System.out.println("sayi3==>" + sayi3);

		scanner.nextLine();

		System.out.println("Lütfen bir isim giriniz");
		String isim = scanner.nextLine();
		System.out.println(isim);
		System.out.println("Program sonlandı");

	}

}
