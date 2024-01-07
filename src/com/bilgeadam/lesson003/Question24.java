package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
    Dışarıdan bir kelime gireceğiz ve harfi başına index numarası gelcek şekilde yazdıracagız
    Java
    0-J
    1-a
    2-v
    3-a

 */
public class Question24 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();

        for (int i=0;i<kelime.length();i++){
            System.out.println(i+"-"+kelime.charAt(i));
        }
    }
}
