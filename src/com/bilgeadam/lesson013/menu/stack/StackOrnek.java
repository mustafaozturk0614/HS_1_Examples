package com.bilgeadam.lesson013.menu.stack;

import java.util.Stack;

/*

    Yıgın
    FILO
    LIFO

    bir stack olusuracagız
    içine 6, 7 tane deger ekleyeceğiz

    100 Tl den buyukleri baska bir stack yapısında toplaycagız
    100 Tl den kucuk degerlerin ise toplamını bulup
    yazdıralım



 */
public class StackOrnek {


    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        Stack<Integer> yuzdenBuyukler=new Stack<>();
        int toplam=0;
        stack.add(200);
        stack.push(200);
        stack.push(50);
        stack.push(25);
        stack.push(125);
        stack.push(400);
        stack.push(20);

//        for (Integer para : stack){
//
//            if (para>100){
//                yuzdenBuyukler.push(para);
//            }else{
//                toplam+=para;
//            }
//        }

        while (!stack.isEmpty()){
            if (stack.peek()>100){
                yuzdenBuyukler.push(stack.pop()) ;
            }else{
                toplam+=stack.pop();
            }
        }
        System.out.println(toplam);
        System.out.println(yuzdenBuyukler);

    }

}
