package com.bilgeadam.lesson001;

import java.util.Scanner;

/*
 * 
 * 1 den girdiğmiz sayıya kadar olan sayıları yazdıralım 
 * 
 */
public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();

		for (int i = 1; i <= sayi; i++) {
			System.out.print(i + " ");
		}

		int a = 1;

		System.out.println();
		// for (; a < sayi; a++) {

		// }

		while (a <= sayi) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println();

		a = 1;

		do {
			System.out.println(a);
			a++;
		} while (a <= sayi);

	}

}
