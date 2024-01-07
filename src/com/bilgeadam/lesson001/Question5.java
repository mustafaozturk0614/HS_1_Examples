package com.bilgeadam.lesson001;

import java.util.Scanner;

/*
 * 
 * dışarıdan bir isim soy isim bir dogumyılı alalım 
 * 
 * daha sonra şu cıktıyı verecegiz Mustafa 35 yaşında Ehliyet alabilir 
 * veya Mustafa 17 yaşında ehliyet alamaz(if else kullanmadan)
 * 
 * 
 */
public class Question5 {

	public static void main(String[] args) {
		// kod 20 yasından buyuk olup olmadıgını belirtiyor eger 20 den buyuk se
		// kodumuzun degeri 1
		// değil ise -1
		int kod;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir isim giriniz");
		String name = scanner.nextLine();
		System.out.println("Lütfen bir soy isim giriniz");
		String lastName = scanner.nextLine();
		System.out.println("Lütfen dogum yılı");
		int birthDate = scanner.nextInt();
		int yas = 2023 - birthDate;

		// Tenary kullanımı
		boolean kontrol = yas > 18;

		String durum = yas > 18 ? "Ehliyet Alablir" : "Ehliyet Alamaz";

		kod = yas > 20 ? 1 : -1;

		System.out.println(name + " " + yas + " yasında " + durum);
		System.out.println("kod==>" + kod);

	}

}
