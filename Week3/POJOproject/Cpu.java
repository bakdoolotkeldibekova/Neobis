package com.company;

public class Cpu {
    private int id;
    private String model;
    private int nucleus;
    private double frequency;

    //constructors
    public Cpu(){};
    public Cpu(String m, int n, double f, int id){
        model = m;
        nucleus = n;
        frequency = f;
        this.id = id;
    }

    //getters&setters
    public String getModel() {
        return model;
    }
    public int getNucleus() {
        return nucleus;
    }
    public double getFrequency() {
        return frequency;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setNucleus(int nucleus) {
        this.nucleus = nucleus;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}