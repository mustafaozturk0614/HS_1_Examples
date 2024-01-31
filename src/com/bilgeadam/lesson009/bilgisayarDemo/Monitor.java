package com.bilgeadam.lesson009.bilgisayarDemo;

public class Monitor {

    int boyut;

    int kareHizi;

    public Monitor(int boyut, int kareHizi) {
        this.boyut = boyut;
        this.kareHizi = kareHizi;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "boyut=" + boyut +
                ", kareHizi=" + kareHizi +
                '}';
    }
}
