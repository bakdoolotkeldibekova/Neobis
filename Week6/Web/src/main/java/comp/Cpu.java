package comp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Cpu {

    private @Id @GeneratedValue int id;
    private String model;
    private int nucleus;
    private double frequency;

    public Cpu(){};
    public Cpu(int id, String model, int nucleus, double frequency){
        this.id = id;
        this.model = model;
        this.nucleus = nucleus;
        this.frequency = frequency;
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