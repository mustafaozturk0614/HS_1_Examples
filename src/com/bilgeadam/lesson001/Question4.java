package com.bilgeadam.lesson001;

import java.util.Scanner;

/*
 * dışarıdan iki sayı alıp toplayalım toplamın çift olup olmadıgını ekrana yazdıralım (true)
 * 
 * (if-else kullanmadan)
 * 
 * 
 */
public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir sayi giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("Lütfen bir sayi giriniz");
		int sayi2 = scanner.nextInt();

		int toplam = sayi1 + sayi2;

		System.out.println("toplam: " + toplam);
		boolean kontrol = toplam % 2 == 0;
		System.out.println(toplam % 2 == 0);
		System.out.println(kontrol);

	}

}
