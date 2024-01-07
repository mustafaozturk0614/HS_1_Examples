package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * 1 den girdiğimiz sayıya kadar olan sayıların toplamını yazdıran program

 * 
 */
public class Question7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;

		for (int i = 1; i <= sayi; i++) {
			toplam += i;
		}
		System.out.println("toplam===>" + toplam);

	}
}