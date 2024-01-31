package com.bilgeadam.lesson009.pokemon;

public class Test {

    public static void main(String[] args) {
        Pokemon pokemon1=new Pokemon();
        pokemon1.ad="Pikhachu";
        pokemon1.tur="Elektrik";
        pokemon1.seviye=2;
        pokemon1.guc=75;
        pokemon1.can=250;
        pokemon1.saldir();
        pokemon1.kacinma();
        pokemon1.bilgileriGoster();


        Pokemon pokemon2= new Pokemon(2,"Charizard","Ateş");
//        pokemon2.ad="Charizard";
//        pokemon2.tur="Ateş";
//        pokemon2.seviye=3;
//        pokemon2.guc=190;
//        pokemon2.can=450;
//        pokemon2.saldir();
//        pokemon2.kacinma();
      pokemon2.bilgileriGoster();

      Pokemon pokemon3=new Pokemon(3,"Squirtle","Su",70,200);
      pokemon3.bilgileriGoster();



    }
}
