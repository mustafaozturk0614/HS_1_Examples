package com.bilgeadam.lesson010.interfaceDemo;

/*
    public ==> heryerden erişime acık
    private ==> sadece aynı sınıf içinde
    protected==>  aynı paket ve alt sınfılarda
    default ==> herhangi  bir erişim belirteci belirtilmemisse default dur ve sadece aynı paketten erisim sağlanır

 */
public class Hesap  implements IHesap{
  private  String hesapNo;
  double bakiye;
  protected  String kullaniciIsmi;
  private Banka banka;

    public Hesap(String hesapNo, double bakiye, String kullaniciIsmi) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.kullaniciIsmi = kullaniciIsmi;
    }


    public Banka getBanka() {
        return banka;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullaniciIsmi() {
        return kullaniciIsmi;
    }

    public void setKullaniciIsmi(String kullaniciIsmi) {
        this.kullaniciIsmi = kullaniciIsmi;
    }

    @Override
    public   void   paraYatir(double miktar){
        this.bakiye+=miktar;
    }



    @Override
    public void paraCek(double miktar) {
        this.bakiye-=miktar;
        System.out.println(miktar+ "tutarında para cekilmiştir");
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hesap{");
        sb.append("hesapNo='").append(hesapNo).append('\'');
        sb.append(", bakiye=").append(bakiye);
        sb.append(", kullaniciIsmi='").append(kullaniciIsmi).append('\'');
        sb.append(", banka=").append(banka);
        sb.append('}');
        return sb.toString();
    }
}
