package com.bilgeadam.lesson020.dateOrnek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateOrnek {

    public static void main(String[] args) {

        /*
            1- gunumuzde bir tarih olsuturun
            2- bir geçmiş birde gelecek zamanda tarih olsutrun
            3-String bir degerden tarih olsturun
            4- iki tarihi karşılastırın
         */

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2020, 05, 12);
        System.out.println(date2);
        LocalDate date3 = LocalDate.of(2025, Month.FEBRUARY, 13);
        System.out.println(date3);
        //default format yıl-ay-gun  2024-03-24  (24/03/2012)
        String defaultStringDate = "2023-05-22";
        LocalDate date4 = LocalDate.parse(defaultStringDate);
        System.out.println(date4);
        /// Formatter
        //
        String stringDate2 = "10/12/2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate date5 = LocalDate.parse(stringDate2, formatter);
        //LocalDate date6 = LocalDate.parse(stringDate2);
        System.out.println(date5);
        //4-
        System.out.println(date2.isAfter(date3));
        System.out.println(date2.isBefore(date3));
        System.out.println(date2.isEqual(date3));

        // plus minus
        System.out.println(date1);
        System.out.println(date1.plusDays(1));
        System.out.println(date1.plusWeeks(1));
        System.out.println(date1.plusMonths(1));
        System.out.println(date1.plusYears(1));
        System.out.println(date1.minusYears(1));

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.now().minusHours(2);

        long saat = dateTime2.until(dateTime1, ChronoUnit.HOURS);
        System.out.println(saat);
        long dakika = dateTime2.until(dateTime1, ChronoUnit.MINUTES);
        System.out.println(dakika);
        long gun = date2.until(date3, ChronoUnit.DAYS);
        System.out.println(gun);
        long yil = ChronoUnit.YEARS.between(date2, date3);
        System.out.println(yil);
        long yil2 = date2.until(date3, ChronoUnit.YEARS);
        System.out.println(yil2);
        System.out.println(date2);
        System.out.println(date2.getMonth());
        System.out.println(date2.getDayOfMonth());
        System.out.println(date2.getDayOfWeek());
        System.out.println(date2.getDayOfYear());
        System.out.println(date2.getMonthValue());
        System.out.println(date2.getYear());
    }
}
