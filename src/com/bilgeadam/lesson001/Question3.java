package com.bilgeadam.lesson001;

/*
 * 
 * Bir urun fiyatında %20 kdv %15 kar payı oldugunu biliyoruz
 *  bu urunun son fiyatı elimizde olsun daha sonra bu son fiyatdam 
 *  urunun ham fiyatı ve kdvsiz fiyatlarını bulalım 
 * 
 */
public class Question3 {

	public static void main(String[] args) {

		int sonFiyat = 2000;
		float karPayi = 0.15f;
		float kdv = 0.2f;
		float kdvsizFiyat, hamFiyat;

		kdvsizFiyat = sonFiyat / (1 + kdv);

		hamFiyat = kdvsizFiyat / (1 + karPayi);

		System.out.println("ürünün kdvsiz fiyatı: " + kdvsizFiyat + "TL");
		System.out.println("ürünün ham fiyatı: " + hamFiyat + "TL");

		// System.out.println(9/2);

	}

}
