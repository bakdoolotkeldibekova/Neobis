package com.company;

public class Ram {
    private int id;
    private double size;
    private String model;

    //constructors
    public Ram(){};
    public Ram(double si, String m, int id){
        size = si;
        model = m;
        this.id = id;
    }

    //getters&setters

    public double getSize() {
        return size;
    }
    public String getModel() {
        return model;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}