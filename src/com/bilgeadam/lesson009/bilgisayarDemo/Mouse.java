package com.bilgeadam.lesson009.bilgisayarDemo;

public class Mouse {

    int gecikmeSuresi;

    public Mouse(int gecikmeSuresi) {
        this.gecikmeSuresi = gecikmeSuresi;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "gecikmeSuresi=" + gecikmeSuresi +
                '}';
    }
}
