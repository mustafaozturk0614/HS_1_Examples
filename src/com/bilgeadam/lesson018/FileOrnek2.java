package com.bilgeadam.lesson018;

import java.io.*;

/*
    Okuma ve Yazma işlemleri

    output==> yazma
    input==> okuma


 */
public class FileOrnek2 {

    static String path = "E:\\hs_1_workspace\\fileOrnekler\\deneme1.txt";
    static String path2 = "E:/hs_1_workspace/fileOrnekler/deneme2.txt";
    static String path3 = "E:/hs_1_workspace/fileOrnekler/deneme3.txt";


    public static void main(String[] args) {


        /// Yazma İşlemi
        File file = new File(path);
        FileOutputStream fos1 = null;
        try {

            fos1 = new FileOutputStream(file);
            FileOutputStream fos2 = new FileOutputStream(path2);

            fos1.write(74);
            fos1.write(65);
            fos1.write(86);
            fos1.write(65);

            byte[] array = {74, 65, 86, 65};
            fos1.write(array);
            String kelime = "--java";
            fos1.write(kelime.getBytes());


        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fos1.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        //// Okuma işlemi
        try {
            FileInputStream fis = new FileInputStream(path);

//            int deger1 = fis.read();
//            System.out.println(deger1);
//            int deger2 = fis.read();
//            System.out.println(deger2);
//            System.out.println((char) (deger1));
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());
            int deger;
            //  deger = fis.read();
            while ((deger = fis.read()) != -1) {
                System.out.println((char) deger);
            }
//            for (int i = 0; i < file.length(); i++) {
//                System.out.println((char) fis.read());
//            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
