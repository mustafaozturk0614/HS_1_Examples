package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * 1 den girdiğimiz sayıya kadar olan çift sayıların toplamını yazdıran program ( 2 çözümü var
çözümlerden 1 i için tenary kullanabilirsiniz )


 * 
 */
public class Question8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;

		for (int i = 2; i <= sayi; i+=2) {
			toplam += i;
		}
		System.out.println("toplam===>" + toplam);

		toplam=0;

		for (int i=1;i<=sayi;i++){

			int cift=i%2==0?i:0;

		//	String deger=i%2==0?"çift":"tek";

		//	System.out.println(deger);

			toplam+=cift;
		}
		System.out.println("toplam===>" + toplam);

	}


}