package com.bilgeadam.lesson019;

import java.util.Scanner;

public class Utility {
    static Scanner scanner = new Scanner(System.in);

    public static int intDegerAlma(String sorgu) {
        int value = 0;
        boolean kontrol = false;
        do {
            System.out.println(sorgu);
            try {
                value = Integer.parseInt(scanner.nextLine());
                kontrol = false;
            } catch (Exception e) {
                System.out.println("Lütfen sayısal bir deger giriniz: " + e.getMessage());
                kontrol = true;
            }

        } while (kontrol);

        return value;
    }

    public static double doubleDegerAlma(String sorgu) {
        double value = 0;
        boolean kontrol = false;
        do {
            System.out.println(sorgu);
            try {
                value = Double.parseDouble(scanner.nextLine());
                kontrol = false;
            } catch (Exception e) {
                System.out.println("Lütfen sayısal bir deger giriniz: " + e.getMessage());
                kontrol = true;
            }

        } while (kontrol);

        return value;
    }

    public static long longDegerAlma(String sorgu) {
        long value = 0;
        boolean kontrol = false;
        do {
            System.out.println(sorgu);
            try {
                value = Long.parseLong(scanner.nextLine());
                kontrol = false;
            } catch (Exception e) {
                System.out.println("Lütfen sayısal bir deger giriniz: " + e.getMessage());
                kontrol = true;
            }

        } while (kontrol);

        return value;
    }

    public static String stringDegerAlma(String sorgu) {
        System.out.println(sorgu);
        return scanner.nextLine();
    }


    public static void main(String[] args) {
        intDegerAlma("bir sayi giriniz");
    }
}
