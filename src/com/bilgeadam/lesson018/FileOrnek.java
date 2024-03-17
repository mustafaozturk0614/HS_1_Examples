package com.bilgeadam.lesson018;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileOrnek {

    static String path = "E:\\hs_1_workspace\\fileOrnekler\\deneme.txt";
    static String path2 = "E:/hs_1_workspace/fileOrnekler/deneme2.txt";
    static String path3 = "E:/hs_1_workspace/fileOrnekler";

    public static void main(String[] args) {

        File file = new File(path);
        File file2 = new File(path2);
        File file3 = new File(path3);

        System.out.println(file);
        System.out.println(file2);
        System.out.println(file3);

        try {
            if (file.createNewFile()) {
                System.out.println("dosya olusturuldu");
            } else {
                System.out.println("dosya olusturlamadı");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("File Metotları");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file3.isDirectory());
        System.out.println(file3.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        System.out.println(file.exists());
        System.out.println(file2.exists());
        System.out.println(file.length());

        System.out.println(file.delete());
        System.out.println(file2.delete());

        System.out.println(Arrays.toString(file3.list()));
        System.out.println(Arrays.toString(file3.listFiles()));

        Path myPath = Path.of("E:/hs_1_workspace/fileOrnekler/deneme3.txt");


        try {
            Files.createFile(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            Files.deleteIfExists(myPath);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


    }
}
