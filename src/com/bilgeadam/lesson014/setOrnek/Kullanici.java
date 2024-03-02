package com.bilgeadam.lesson014.setOrnek;

import java.util.Objects;

public class Kullanici {
    private  int id;
    private  String username;

    public Kullanici(int id, String username) {
        this.id = id;
        this.username = username;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kullanici{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kullanici kullanici = (Kullanici) o;
        return id == kullanici.id && Objects.equals(username, kullanici.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }

}
