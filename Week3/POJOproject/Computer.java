package com.company;

public class Computer {
    private int id;
    private Hdd[] hdds;
    private Ram ram;
    private Os os;
    private Cpu cpu;

    public Computer(){}
    public Computer(int id, Hdd[] hdds, Ram ram, Os os, Cpu cpu){
        this.id = id;
        this.hdds = hdds;
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
    }

    public Hdd[] getHdds(){
        return hdds;
    }
    public Ram getRam(){
        return ram;
    }
    public Os getOs(){
        return os;
    }
    public Cpu getCpu(){
        return cpu;
    }

    public void setHdds(Hdd[] hdds) {
        this.hdds = hdds;
    }
    public void setRam(Ram ram) {
        this.ram = ram;
    }
    public void setOs(Os os) {
        this.os = os;
    }
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}