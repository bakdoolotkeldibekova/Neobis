package com.company;

public class Os {
    private int id;
    private String name;
    private String version;

    //constructors
    public Os(){};
    public Os(String n, String v, int id){
        name = n;
        version = v;
        this.id = id;
    }

    //getters&setters
    public String getName() {
        return name;
    }
    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}