package com.bilgeadam.lesson018;

import java.io.*;

/*


 */
public class FileOrnek4 {
    static String path2 = "E:/hs_1_workspace/fileOrnekler/deneme2.txt";

    public static void main(String[] args) {
        BufferedWriter writer = null;
        BufferedReader reader = null;

        /// Yazma işlemi
        try {
            FileWriter fileWriter = new FileWriter(path2, true);
            writer = new BufferedWriter(fileWriter);
            //  writer = new BufferedWriter(new FileWriter(path2, true));
            writer.write("Deneme\n");
            writer.write("Deneme2");
            writer.newLine();
            writer.write("Deneme3");
            writer.newLine();
            writer.write("Deneme4");
            writer.newLine();
            //  writer.flush();
            writer.write("xyza", 2, 2);// off degeri baslangıc indexi len degeri baslangıc indexinden itibaren kac deger yazdıracgım
            writer.newLine();
            writer.append("xyzab", 2, 4); //start basalangıc indexi end bitiş indexi (end degeri işleme alınmaz )
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        // okuma işlemi
        BufferedReader reader2;
        try {
            reader = new BufferedReader(new FileReader(path2));
            // her akış  sıfırdan okuma yapıyor
//            reader2 = new BufferedReader(new FileReader(path2));
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader2.readLine());

//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
            String deger;
            while ((deger = reader.readLine()) != null) {
                System.out.println(deger);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
