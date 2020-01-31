package com.company;

public class Hdd {
    private int id;
    private double size; // в TB
    private double speed; //в GHz

    //constructors
    public Hdd(){};
    public Hdd(double si, double sp, int id){
        size = si;
        speed = sp;
        this.id = id;
    }

    //getters&setters
    public double getSize() {
        return size;
    }
    public double getSpeed() {
        return speed;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}