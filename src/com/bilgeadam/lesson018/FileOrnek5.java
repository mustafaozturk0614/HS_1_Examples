package com.bilgeadam.lesson018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOrnek5 {

    public static void main(String[] args) {
        String path = "E:\\hs_1_workspace\\fileOrnekler\\movie2.csv";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
            String movie;
            while ((movie = reader.readLine()) != null) {
                System.out.println(movie);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
