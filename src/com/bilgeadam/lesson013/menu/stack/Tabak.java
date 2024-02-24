package com.bilgeadam.lesson013.menu.stack;

/*

    her tabakda bir id
    birde kirli olup olmadıgını tutan bir veri
    1- MAnager sınıfmız oalcak
    bu manger sınıfında 10 tane tabak ureteceğiz ve bunların kirli olup olmadıklarıda rastgele gelsin

    temizleri bir stackde toplayacagız kirlileri baska bir stack de

      kullan metodu yazlım ==> temizlerdeki bir tabağı alacak ve bunu kırletecek
      temizle metoduYazalım==> kitlilerdeki bir tabağı alacak ve bunu temizleyecek
      secim yap metodu dısarıdan bir secim alacak seceim 1 ise temizel 2 ise kullan metodu calısacak
      daha sonra test sınıfında tabakları olusturduktan sonra
      20 kere secim yap metodunu calıstıracagız
      secim yap metoduna herdefasında rastgele secimler gelecek




 */
public class Tabak {

    private int id;
    private   boolean kirliMi;

    public Tabak(int id) {
        this.id = id;
    }

    public Tabak(int id, boolean kirliMi) {
        this.id = id;
        this.kirliMi = kirliMi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isKirliMi() {
        return kirliMi;
    }

    public void setKirliMi(boolean kirliMi) {
        this.kirliMi = kirliMi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tabak{");
        sb.append("id=").append(id);
        sb.append(", kirliMi=").append(kirliMi);
        sb.append('}');
        return sb.toString();
    }
}
