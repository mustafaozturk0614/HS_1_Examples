package com.bilgeadam.lesson013.menu.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
    FIFO



 */
public class KuyrukOrnek {


    public static void main(String[] args) {
        Queue<Integer> kuyruk1= new LinkedList<>();
        kuyruk1.add(20);
        kuyruk1.add(30);
        kuyruk1.add(40);
        kuyruk1.add(50);

        while (!kuyruk1.isEmpty()){
          //  System.out.println(kuyruk1.peek());
            System.out.println(kuyruk1.poll());
        }

        Queue<Integer> kuyruk2= new ArrayBlockingQueue<>(5);
        kuyruk2.offer(60);
        kuyruk2.offer(70);
        kuyruk2.offer(80);
        kuyruk2.offer(90);
        kuyruk2.offer(100);
        kuyruk2.offer(110);
        System.out.println("//////////////////////");
        while (!kuyruk2.isEmpty()){
            //  System.out.println(kuyruk1.peek());
            System.out.println(kuyruk2.poll());
        }

        Queue<String> kuyruk3= new PriorityQueue<>();
        kuyruk3.offer("Mustafa");
        kuyruk3.offer("Ayşe");
        kuyruk3.offer("Serkan");
        kuyruk3.offer("Zeliha");
        kuyruk3.offer("Derya");
        System.out.println("//////////////////////////");
        while (!kuyruk3.isEmpty()){
            //  System.out.println(kuyruk1.peek());
            System.out.println(kuyruk3.poll());
        }
        Queue<Integer> kuyruk4= new PriorityQueue<>();
        kuyruk4.offer(50);
        kuyruk4.offer(20);
        kuyruk4.offer(40);
        kuyruk4.offer(30);
        kuyruk4.offer(100);
        System.out.println("//////////////////////////");
        while (!kuyruk4.isEmpty()){
            //  System.out.println(kuyruk1.peek());
            System.out.println(kuyruk4.poll());
        }
    }
}
