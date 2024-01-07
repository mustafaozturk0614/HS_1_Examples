package com.bilgeadam.lesson001;

/*
 * stack bellek nedir
 * heap bellek nedir arastıralım
 * 
 */
public class Question1 {

	public static void main(String[] args) {

		// Tek satırlık yorum

		/*
		 * Sayısal Değişkenler
		 * 
		 * primitive tür değişkenler
		 * 
		 * primitive turler stack bellekte tutulur
		 * 
		 * 
		 */

		byte myByte = 2; // 8 bit -128 ile 127 arası

		short myShort = 35;// 16 bit -32768 ile 32767

		int myInt = 125;// 32 bit -2147483648 ile 2147483647

		int maxInt = 2147483647;

		long myLong = 125_648_900_000L; // 64bit

		int myInt3 = (int) 125_648_900_000L;

		float myFloat = 145.89f;// 32 bit

		double myDouble = 2_000_582.85;// 64 bit

		char myChar = 98;// 16 bit
		// ctrl alt aşağı ok tuşuna basarak aşağı dogru satırı cogaltırız

		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(maxInt);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);

		short myShort2 = (short) (32768 * 2);

		System.out.println("====>" + myShort2);
		// tek bir karakter tutar
		char myChar2 = 'A';
		System.out.println((int) myChar2);
		char myChar3 = 66;
		System.out.println(myChar3);
		char myChar4 = 97;
		System.out.println((myChar4 + myChar3));
		System.out.println((char) (myChar4 + myChar3));
		System.out.println("===>" + myChar4 + myChar3);

		// Mantıksal değişken

		boolean myBooolean = true;
		boolean myBooolean2 = false;

		System.out.println(myBooolean);
		System.out.println(myBooolean2);

		// ifadesel değişken
		String myString = "Mustafa";
		System.out.println(myString);

	}

}
