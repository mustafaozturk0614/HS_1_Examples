package com.bilgeadam.lesson008.pokemon;

public class SuPokemonu extends Pokemon{
    public int yuzmeHizi;
    public int suBasincGucu;

    public SuPokemonu(int myId,String myAd,String myTur,int myGuc,int myCan){
        super(myId,myAd,myTur,myGuc,myCan);

    }
    public SuPokemonu(int myId,String myAd,String myTur,int myGuc,int myCan,int myYuzmeHizi){
        super(myId,myAd,myTur,myGuc,myCan);
        yuzmeHizi=myYuzmeHizi;

    }

}
