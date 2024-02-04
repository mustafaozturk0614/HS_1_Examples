package com.bilgeadam.lesson011.interfacedemo;

public abstract class Arac  implements ICommon{

   private  int hiz;

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Arac{");
        sb.append("hiz=").append(hiz);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void hizlan() {
        System.out.println(getClass().toString());
        System.out.println(getClass().getSimpleName()+" hızlanıyor" );
    }

    @Override
    public void yavasla() {
        System.out.println(getClass().getSimpleName()+" yavaslıyor" );
    }
}
