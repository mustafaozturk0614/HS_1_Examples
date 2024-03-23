package com.bilgeadam.lesson019;

import java.io.*;

/*
 1- dosya olustur==> dısarıdan dosya ismini alacak  eger ilk defa olsuturyorsam  fileornekler.txt basrılı sekilde olustu
  eger daha once varsa   fileornekler.txt daha once olusturulmustur.
 */
public class FileIslemler {


    public void menu() {
        System.out.println(" " +
                "    1- Dosya yarat\n" +
                "    2- Dosya Sil\n" +
                "    3- Dosya ya veri ekle\n" +
                "    4- Dosya dan veri oku\n" +
                "    5- Dosya daki bir harfi başka bir harf ile değiştir");
    }

    public void uygulama() {
        int secim = 0;
        do {
            menu();
            secim = Utility.intDegerAlma("lütfen bir işlem seciniz");
            switch (secim) {
                case 1:
                    dosyaOlustur();
                    break;
                case 2:
                    dosyaSil();
                    break;
                case 3:
                    dosyayaVeriYaz();
                    break;
                case 4:
                    System.out.println(dosyayadanVeriOkuma());
                    // System.out.println(dosyayadanVeriOkuma().length());
                    ;
                    break;
                case 5:
                    //   harfDegistir();
                    break;
                case 0:
                    break;
            }
        } while (secim != 0);


    }

    /*
        hangi dosyayı okumak istiyorsa kullanıcdan dosya ismini alalım
        bu dosyayı okuyup içindeki verileri bir String degerde tutalım

     */

    public String dosyayadanVeriOkuma() {
        String fileName = Utility.stringDegerAlma("Lütfen Dosya Adını dosya uzantısı ile beraber giriniz");
        File dosya = new File(FileSabitler.path + fileName);
        String tumMetin = "";

        BufferedReader bufferedReader = null;
        try {
            if (dosya.exists()) {
                System.out.println("Dosya Bulundu");
                bufferedReader = new BufferedReader(new FileReader(dosya));
                String metin = "";
                while ((metin = bufferedReader.readLine()) != null) {
                    tumMetin += metin + "\n";
                }
            } else {
                System.out.println("Dosya Bulunamadı");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return tumMetin.substring(0, tumMetin.length() - 1);
    }


    /*
        veri yazmak istediğimiz dosya ismini kullanıcadan alalım daha sonra
        hangi veriyi yazmak istiyortsak onuda kullanıcadan alıp o dosya içine yazdıralım
     */

    public void dosyayaVeriYaz() {
        String fileName = Utility.stringDegerAlma("Lütfen Dosya Adını dosya uzantısı ile beraber giriniz");
        File dosya = new File(FileSabitler.path + fileName);
        BufferedWriter writer = null;
        try {
            if (dosya.exists()) {
                System.out.println("Dosya bulundur");
                String metin = Utility.stringDegerAlma("Yazmak istediğiniz metni giriniz.");
                writer = new BufferedWriter(new FileWriter(dosya, true));
                writer.write(metin);
                writer.newLine();
            } else
                System.out.println("Aradığınız dosya bulunamamıştır.");
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata oluştu.");

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    /*
     silmek istenen dosya ismi kullanıcıdan alınsın (uzantısı ile beraber alalım   filedeneme1.txt)
     eger dosya varsa  silme işleminden sonra basarılı bir şekilde silindi cıkstıını verelim
     dosya yoksa dosya bulunamadı ()
     */
    public void dosyaSil() {
        String fileName = Utility.stringDegerAlma("Lutfen silmek istediginiz dosya adinı uzantısı ile beraber giriniz!");
        File dosya = new File(FileSabitler.path + fileName);
        if (dosya.delete()) {
            System.out.println("DOSYA BASARILI SEKILDE SILINDI");
        } else {
            System.out.println("DOSYA BULUNAMADI");
        }
    }

    public void dosyaOlustur() {
        String fileName = Utility.stringDegerAlma("Lutfen bir dosya adinı uzantısı ile beraber giriniz!");
        File dosya = new File(FileSabitler.path + fileName);
        try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getAbsolutePath() + " adlı Dosya basarili bir sekilde olusturuldu!");
            } else {
                System.out.println(dosya.getAbsolutePath() + " adlı Dosya daha onceden olusturulmustur!");

            }
        } catch (IOException e) {
            System.out.println("bir hata meydana geldi:" + e.getMessage());
        }

    }
}
