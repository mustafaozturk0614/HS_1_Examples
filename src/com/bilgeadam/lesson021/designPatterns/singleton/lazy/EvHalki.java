package com.bilgeadam.lesson021.designPatterns.singleton.lazy;

public class EvHalki extends Thread {

    private String statu;

    public EvHalki(String statu) {
        this.statu = statu;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EvHalki{");
        sb.append("statu='").append(statu).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void robotCagir() {
        Robot robot = Robot.getInstance();
        System.out.println(statu);
        robot.calis();
    }

    @Override
    public void run() {
        robotCagir();
    }
}
