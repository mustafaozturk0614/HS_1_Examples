package com.bilgeadam.lesson001;

/*
 * iki tane string değişkenimiz olsun isim soy isim birde yaş için bir değişken tutalım 
 * 
 * en sonunda cıktımız bu olsun Mustafa Ozturk 35
 * 
 * 
 */
public class Question2 {

	public static void main(String[] args) {

		String name = "Mert";
		String lastName = "Ertuğral";
		int age = 30;

		System.out.println(name + " " + lastName + " " + age);
		System.out.println("/////////////////////");
		System.out.print(name + " ");
		System.out.print(lastName + " ");
		System.out.print(age);
		System.out.println("////");

		String fullName = name + "\n" + lastName + "\n";
		System.out.println(fullName + age);
		String fullName2 = name + "\t" + lastName + "\t\t\t" + age;
		System.out.println(fullName2);

	}

}
