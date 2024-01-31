package com.bilgeadam.lesson009.pokemon;

public class SuPokemonu extends Pokemon {
    public int yuzmeHizi;
    public int suBasincGucu;
    public SuPokemonu(){
        super();
        System.out.println("Su pokemonu olusturuluyor");
    }
    public SuPokemonu(int myId,String myAd,String myTur,int myGuc,int myCan){
        super(myId,myAd,myTur,myGuc,myCan);

    }
    public SuPokemonu(int myId,String myAd,String myTur,int myGuc,int myCan,int myYuzmeHizi){
        super(myId,myAd,myTur,myGuc,myCan);
        yuzmeHizi=myYuzmeHizi;

    }
    public SuPokemonu(int yuzmeHizi){
        this.yuzmeHizi=yuzmeHizi;
    }


    @Override
    public void saldir() {
        super.saldir();
        System.out.println( "su saldırısı yapıyor");
    }
}
