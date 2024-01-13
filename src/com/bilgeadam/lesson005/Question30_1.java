package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH 2002002000
 * gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın
 * eğer OTH ise Yurt dışı işlemler yazdıralım
 * 2000 ile bitiyorsa kıta içi işelmeler ve OTH 2002002000 yerine Ki 2002002000
 * eğer 2000 ile bitmiyorsa OTH 2002002002 yerine Kd 2002002002yazdıralım
 */
public class Question30_1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir iban no giriniz");
        String iban=scanner.nextLine();
        //Tr 5646565001
        //OTH 56894666
        String secim=iban.substring(0,iban.indexOf(" "));
        String bankaNo=iban.substring(iban.length()-4);

        switch (secim){
            case "Tr":
                System.out.println("Yurt içi işlemler");
                    switch (bankaNo){
                        case "5001":
                            System.out.println("Ziraat Bankası");
                            break;
                        case "5002":
                            System.out.println("Garanti Bankası");
                            break;
                        case "5003":
                            System.out.println("iş Bankası");
                            break;
                        default:
                            System.out.println("Diğer");
                            break;
                    }
                break;
            case "OTH":
                System.out.println("Yurt dışı işlemler");
                    switch (bankaNo){
                        case "2000":
                            System.out.println("Kıta içi işlemler");
                            System.out.println(iban.replace("OTH","Ki"));
                            break;
                        default:
                            System.out.println("Kıta dışı işlemler");
                            System.out.println(iban.replace("OTH","Kd"));
                            break;

                    }

                break;
        }

    }


}
