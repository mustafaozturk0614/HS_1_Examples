package com.bilgeadam.lesson016;

import java.util.ArrayList;
import java.util.List;

public class ExceptionOrnek1 {


    public static void main(String[] args) {
        List<String> isimler = null;

        try {
            isimler.add("Mustafa");
            System.out.println("Mustafa Listeye eklendi");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Mustafa listeye eklenemedi");
            isimler = new ArrayList<>();
        } finally {
            System.out.println("Finally çalıstı-1");
        }
        System.out.println("Program Devam ediyor");


        try {
            isimler.add("Özge");
            System.out.println("Özge Listeye eklendi !!!!!!!!!!!!!!!!!!!!!!!");
        } catch (NullPointerException e) {
            System.out.println("Özge listeye eklenemedi");
        } finally {
            System.out.println("Finally çalıstı-2");
        }

        System.out.println("Program Devam ediyor");

    }


}
