package com.bilgeadam.lesson011.abstractdemo;

public abstract class Database {
    private int id;
    private String username;
    private  String password;
    private  int connectionCount;

    public int getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(int connectionCount) {
        this.connectionCount = connectionCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void  veriEkle();

    public abstract void  veriSil();

    public abstract void  veriGuncelle();

    public abstract  void  verileriGetir();

    public void   baglantiSayisiniArttir(){
        connectionCount++;
    }
}
