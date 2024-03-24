package com.bilgeadam.lesson020;

import com.bilgeadam.lesson019.FileSabitler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Seven", "Drama", "1995");
        Movie movie2 = new Movie("Pulp Fiction", "Drama", "1994");
        Movie movie3 = new Movie("Fight Club", "Drama", "1999");
        Movie movie4 = new Movie("Inception", "Drama", "2010");
        List<Movie> movies = List.of(movie1, movie2, movie3, movie4);
        //   serilizationListExample(movies);
        serilizationListExample2(movies);
        // deSerilizationListExample();
        deSerilizationListExample2();
//        serilizationExample(movie1);
//        deSerilizationExample();
    }

    public static void serilizationListExample(List<Movie> movies) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(FileSabitler.path + "\\movieList.txt"));

            for (Movie movie : movies) {
                oos.writeObject(movie);
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static void serilizationListExample2(List<Movie> movies) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(FileSabitler.path + "\\movieList2.txt"));
            oos.writeObject(movies);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deSerilizationListExample() {
        ObjectInputStream objectInputStream = null;
        List<Movie> movieList = new ArrayList<>();
        Movie movie = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(FileSabitler.path + "\\movieList.txt"));
            try {

                while ((movie = (Movie) objectInputStream.readObject()) != null) {
                    movieList.add(movie);
                }

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        movieList.forEach(System.out::println);
    }

    public static void deSerilizationListExample2() {
        ObjectInputStream objectInputStream = null;
        List<Movie> movieList = new ArrayList<>();
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(FileSabitler.path + "\\movieList2.txt"));
            try {
                movieList = (List<Movie>) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        movieList.forEach(System.out::println);
    }

    public static void serilizationExample(Movie movie) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(FileSabitler.path + "\\movieDeneme.txt"));
            oos.writeObject(movie);
            System.out.println("serileştirme başarılı");
        } catch (IOException e) {
            System.out.println("serileştirme başarısız");
            System.out.println(e.toString());
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void dosyayaVeriYaz() {
        File dosya = new File(FileSabitler.path + "\\movieDeneme.txt");
        BufferedWriter writer = null;
        try {

            Movie movie = new Movie("Seven", "Drama", "1995");
            writer = new BufferedWriter(new FileWriter(dosya, true));
            writer.write(movie.getTitle() + "," + movie.getGenre() + "," + movie.getYear());
            writer.newLine();
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


    public static void deSerilizationExample() {
        ObjectInputStream objectInputStream = null;
        Movie movie = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(FileSabitler.path + "\\movieDeneme.txt"));
            try {
                movie = (Movie) objectInputStream.readObject();
                System.out.println(movie);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
