package com.bilgeadam.lesson021.designPatterns.singleton;

public class Test {


    public static void main(String[] args) {

        MyPostgreConnection connection1 = MyPostgreConnection.getInstance();
        MyPostgreConnection connection2 = MyPostgreConnection.getInstance();
        MyPostgreConnection connection3 = MyPostgreConnection.getInstance();

        System.out.println(connection1.hashCode());
        System.out.println(connection2.hashCode());
        System.out.println(connection3.hashCode());
    }
}
