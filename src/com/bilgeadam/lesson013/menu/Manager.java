package com.bilgeadam.lesson013.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Manager {
    List<Menu>  haftalikMenu =new ArrayList<>();

    List<EIcecek> icecekler=new ArrayList<>(Arrays.asList(EIcecek.values()));
     Random random=new Random();


    public    ECorba  randomCorbaAta(){
      ECorba [] array= ECorba.values();
      int index=random.nextInt(0,array.length);
      return  array[index];
    }
    public    EIcecek  randomIcecekAta(){
        EIcecek [] array= EIcecek.values();
        int index=random.nextInt(0,array.length);
        return  array[index];
    }
    public    EYemek  randomYemekAta(){
        EYemek [] array= EYemek.values();
        int index=random.nextInt(0,array.length);
        return  array[index];
    }
    public    ETatli  randomTatliAta(){
        ETatli [] array= ETatli.values();
        int index=random.nextInt(0,array.length);
        return  array[index];
    }
    public Enum menuElamaniBelirle(Enum [] array){
        int index=random.nextInt(0,array.length);
        return  array[index];
    }


    public  EIcecek icecekAta(EIcecek [] array){
        int index=random.nextInt(0,array.length);
      while (array[index].isAtandiMi()){
          System.out.println(array[index]+"===>" +array[index].isAtandiMi());
          index=random.nextInt(0,array.length);
      }
        array[index].setAtandiMi(true);
        return  array[index];
    }
    public  EIcecek icecekAta2(){
//    if (this.icecekler.size()==0){
//
//    }
        if (this.icecekler.isEmpty()){
            System.out.println("Liste yeniden dolduruluyor");
         //   return EIcecek.values()[random.nextInt(0,6)];
            this.icecekler=new ArrayList<>(Arrays.asList(EIcecek.values()));
        }
    int index=random.nextInt(0,this.icecekler.size());
    EIcecek icecek=this.icecekler.get(index);
    this.icecekler.remove(icecek);
        System.out.println("listeboyutu===>"+ this.icecekler.size());
        return icecek;
    }

    public Menu gunlukMenuBelirle2(){
        ECorba corba= (ECorba) menuElamaniBelirle(ECorba.values());
      //  EIcecek icecek= icecekAta(EIcecek.values());
        EIcecek icecek= icecekAta2();
        EYemek yemek=(EYemek) menuElamaniBelirle(EYemek.values());
        ETatli tatli=(ETatli) menuElamaniBelirle(ETatli.values());
        Menu menu=new Menu(corba,yemek,tatli,icecek);
        return menu;
    }

    public Menu gunlukMenuBelirle(){
        ECorba corba=randomCorbaAta();
        EIcecek icecek=randomIcecekAta();
        EYemek yemek=randomYemekAta();
        ETatli tatli=randomTatliAta();
        Menu menu=new Menu(corba,yemek,tatli,icecek);
        return menu;
    }
    public List<Menu> haftalıkMenuBelirle(){
        for (EGun gun : EGun.values()){
            Menu menu=gunlukMenuBelirle();
            menu.setGun(gun);
            this.haftalikMenu.add(menu);
        }
        return this.haftalikMenu;
    }

    public List<Menu> haftalıkMenuBelirle2(){
        for (EGun gun : EGun.values()){
            Menu menu=gunlukMenuBelirle2();
            menu.setGun(gun);
            this.haftalikMenu.add(menu);
        }
        return this.haftalikMenu;
    }

    public static void main(String[] args) {
        Manager manager=new Manager();
       // System.out.println(manager.randomCorbaAta());
        manager.haftalıkMenuBelirle2();
        manager.haftalikMenu.forEach(System.out::println);

    }

}
