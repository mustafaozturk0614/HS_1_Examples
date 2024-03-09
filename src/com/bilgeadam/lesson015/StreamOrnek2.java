package com.bilgeadam.lesson015;


import java.util.*;
import java.util.stream.Collectors;

/*
    distinct()
    reduce()
    limit()
    skip()
    max()
    min()
    count()
    sorted()
    toMap()
    groupingBy()
    doubleAveraging()
    mapToInt(),MapToDouble()


 */
public class StreamOrnek2 {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(50,80,75,24,93,102));
        // bu degerlein toplamını bulalım

        Optional<Integer> toplam1 = list.stream().reduce((x, y) -> x + y);
        System.out.println(toplam1);

       Integer toplam2 = list.stream().reduce(5,(x, y) -> x + y);
        System.out.println("///////");
        list.stream().reduce((x,y)->x-y).ifPresent(System.out::println);
        System.out.println( list.stream().reduce(450,(x,y)->x-y));;
        System.out.println("///////");
        System.out.println(toplam2);
        // IntStreamın sum metodunu kullanrak toplama işlemini yapıyoruz
        Integer toplam3 =list.stream().mapToInt(x->x).sum();
        System.out.println(toplam3);
        // ortlama
        System.out.println(list.stream().mapToInt(Integer::intValue).average());  ;
        System.out.println(list.stream().mapToDouble(Integer::doubleValue).average());  ;
        Double ortalama = list.stream().collect(Collectors.averagingDouble(x -> x));
        System.out.println(ortalama);
        IntSummaryStatistics statistics =list.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println("statistics");
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getSum());
        System.out.println("//////////////////////////////////////////////");

        /// Max min
        list.stream().max((x,y)-> x-y).ifPresent(System.out::println);
     Optional<Integer> max =list.stream().max((x,y)-> x-y);
     max.ifPresent(System.out::println);
     list.stream().min((x,y)->x-y).ifPresent(System.out::println);
     list.stream().max(Integer::compareTo).ifPresent(System.out::println);
     list.stream().min(Integer::compareTo).ifPresent(System.out::println);

     list.stream().reduce(Integer::min).ifPresent(System.out::println);
     list.stream().reduce((a,b)->Math.min(a,b)).ifPresent(System.out::println);
        list.stream().reduce(Integer::max).ifPresent(System.out::println);

        List<String> stringList=new ArrayList<>(List.of("Mustafa","Ozge","Serkan","Zeliha","Ayşe","Su","Murat","Mustafa"));

        stringList.stream().sorted().forEach(System.out::println);
        System.out.println("Tersten sıralama");
        stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("kelime uzunluguna gore");
        stringList.stream().sorted((x,y)->x.length()-y.length()).forEach(System.out::println);
        System.out.println("/////////////////////////");
        stringList.stream().sorted((x,y)->y.length()-x.length()).forEach(System.out::println);

        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        System.out.println("/////////////////////////");
        stringList.stream().sorted(comparator).forEach(System.out::println);
        System.out.println("/////////////////////////");
        stringList.stream().sorted(Comparator.comparingInt(x->x.length())).forEach(System.out::println);
        stringList.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


        // uzunluklarına gore maplayelim 4={} 5={}

        Map<Integer, List<String>> map = stringList.stream().collect(Collectors.groupingBy(x -> x.length()));

        System.out.println(map);
        //listede aynı isim tekrarlanmıyorsa bu kod calısır fakat tekrarlanıyor ise calısmaz cunku i
        // simler key degerlemize karsılık geliyor
//        Map<String,Integer> map2=stringList.stream().collect(Collectors.toMap(k->k,v->v.length()));
//        System.out.println(map2);

            // tekrarlanan yaoılar bizim için odenli değilse  asagıdaki 2 .çözümü kullanabiliriz
        Map<String,Integer> map2=stringList.stream().distinct().collect(Collectors.toMap(k->k,v->v.length()));
        System.out.println(map2);
        Map<String,Integer> map4=     stringList.stream().collect(Collectors.toSet()).stream().collect(Collectors.toMap(k->k,v->v.length()));
        System.out.println(map4);



        Map<Character, List<String>> map3 = stringList.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
        System.out.println(map3);



        /// limit skip

        stringList.stream().limit(2).forEach(System.out::println);
        System.out.println("//////////////////");
        stringList.stream().skip(2).limit(3).forEach(System.out::println);

        String birleştirme =stringList.stream().collect(Collectors.joining(","));

        System.out.println(birleştirme);

    }

}
