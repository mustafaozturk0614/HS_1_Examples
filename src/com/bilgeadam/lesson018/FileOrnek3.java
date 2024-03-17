package com.bilgeadam.lesson018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*

    1. dosya yolundaki fotografı okuyup java tarafında cıktılayalım
 */
public class FileOrnek3 {

    static String path = "E:\\hs_1_workspace\\fileOrnekler\\photo1.png";

    public static void main(String[] args) {
        List<Integer> list = dosyadanVeriOkuma();
        dosyayaVeriYazdir("E:\\hs_1_workspace\\fileOrnekler\\copy1.png", list);
        dosyayaVeriYazdir("E:\\hs_1_workspace\\fileOrnekler\\copy2.png", list);
        dosyayaVeriYazdir("E:\\hs_1_workspace\\fileOrnekler\\copy3.png", list);
        dosyayaVeriYazdir("E:\\hs_1_workspace\\fileOrnekler\\copy4.png", list);
        dosyayaVeriYazdir("E:\\hs_1_workspace\\fileOrnekler\\copy5.png", list);
        dosyayaVeriYazdir("E:\\hs_1_workspace\\fileOrnekler\\copy6.png", list);

    }

    public static void dosyayaVeriYazdir(String path, List<Integer> list) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            for (Integer deger : list) {
                fos.write(deger);
            }
            System.out.println("Yazma işlemi tamamlandı");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static List<Integer> dosyadanVeriOkuma() {
        List<Integer> list = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            int deger;
            while ((deger = fis.read()) != -1) {
                list.add(deger);
            }
            System.out.println("okuma işlemi tamamlandı");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return list;
    }

}
