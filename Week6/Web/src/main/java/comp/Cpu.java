package comp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
@Table(name = "cpu", schema = "spring_data_jpa_example")
class Cpu {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "model")
    private String model;

    @Column(name = "nucleus")
    private int nucleus;

    @Column(name = "frequency")
    private double frequency;

    public Cpu(){};
    public Cpu(String model, int nucleus, double frequency){
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
