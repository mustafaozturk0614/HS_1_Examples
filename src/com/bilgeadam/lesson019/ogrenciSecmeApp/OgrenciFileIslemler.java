package com.bilgeadam.lesson019.ogrenciSecmeApp;

/*
    ogrenci.txt dosyasını okuyup
    secilecekler.txt dosyasına aktaracğım
    daha sonra bir ogrenci secip bu ogrenci verisini secilenler.txt dosyasına aktarıp (secilen ogrenci diye cıktıyı vermiş olacagız )
    secilecekler.txt dosyasından silmem gerekecek

        dosyadan verioku==> ogrencitxt.dosyasını okuyacak ve bir listede verileri toplayacak
        listeyiDosyayaYazdirma==> listedeki verileri  secilecekler.txt dosyasına yazdıracagız
        ogrenciSec=> listemizden rastgele bir ogrenciyi secip geri donecek
        secilenOgrenciyiDosyayYazdir==> secilen ogrenci ismini secilenler.txt dosyasına ekleyelim

    //2.kısım
    /*
     baslangicVerisiOlusturma==>   dosyadan veri okuma işlemi ve secilecekler.txt dosyasını olusturma işlemini bu metot ustlenecek

   listedenOgrenciSecme==>   bir ogrenci secilecek(ogrenci sec metodu )
     gelen ogrenci dosyaya yazılacak(secilenOgrenciyiDosyayYazdir)
     secilen ogrenci ismini yazdırıp
     daha sonra bu ogrenci silinecek ve
     seilecekler.txt guncellenecek
     */


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OgrenciFileIslemler {
    List<String> ogrenciler;
    File file;
    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;
    Random random;

    public OgrenciFileIslemler() {
        this.ogrenciler = new ArrayList<>();
        this.random = new Random();
    }

    // 1. Kısım
    public void dosyadanVeriOku(String dosyaYolu) {
        try {
            file = new File(dosyaYolu);
            bufferedReader = new BufferedReader(new FileReader(file));
            String ogrenci;
            while ((ogrenci = bufferedReader.readLine()) != null) {
                ogrenciler.add(ogrenci);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void listeyiDosyayaYazdirma(String dosyaYolu) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(dosyaYolu));
            for (String ogrenci : ogrenciler) {
                bufferedWriter.write(ogrenci);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String ogrenciSec() {
        int index = random.nextInt(ogrenciler.size());
        return ogrenciler.get(index);
    }

    public void secilenOgrenciyiDosyayYazdir(String dosyaYolu, String ogrenci) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(dosyaYolu, true));
            bufferedWriter.write(ogrenci);
            bufferedWriter.newLine();
            System.out.println("Secilen ögrenci===>" + ogrenci);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //2.kısım
    /*
        dosyadan veri okuma işlemi ve secilecekler.txt dosyasını olusturma işlemini bu metot ustlenecek
     */
    public void baslangicVerisiOlusturma() {
        dosyadanVeriOku(FileSabitler.OGRENCI_LISTESI);
        listeyiDosyayaYazdirma(FileSabitler.SECILECEKLER);
        System.out.println("Başlangıç verisi olusturuldu");
    }

    /*
     bir ogrenci secilecek(ogrenci sec metodu )
     gelen ogrenci dosyaya yazılacak(secilenOgrenciyiDosyayYazdir)
     secilen ogrenci ismini yazdırıp
     daha sonra bu ogrenci silinecek ve
     seilecekler.txt guncellenecek
     */
    public void listedenOgrenciSecme() {
        dosyadanVeriOku(FileSabitler.SECILECEKLER);
        if (ogrenciler.isEmpty()) {
            System.out.println("Secilecek ogrenci kalmadı");
            baslangicVerisiOlusturma();
            file = new File(FileSabitler.SECILENLER);
            file.delete();
        }
        String ogrenci = ogrenciSec();
        secilenOgrenciyiDosyayYazdir(FileSabitler.SECILENLER, ogrenci);
        ogrenciler.remove(ogrenci);
        listeyiDosyayaYazdirma(FileSabitler.SECILECEKLER);
    }

}
