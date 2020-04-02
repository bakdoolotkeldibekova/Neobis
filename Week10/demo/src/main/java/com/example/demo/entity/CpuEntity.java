package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "cpu", schema = "comp")
public class CpuEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "model", nullable = false, length = 50)
    private String model;

    @Basic
    @Column(name = "nucleus", nullable = false)
    private int nucleus;

    @Basic
    @Column(name = "frequency", nullable = false, precision = 0)
    private double frequency;

    public CpuEntity() {}
    public CpuEntity(String model, int nucleus, double frequency) {
        this.model = model;
        this.nucleus = nucleus;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getNucleus() {
        return nucleus;
    }
    public void setNucleus(int nucleus) {
        this.nucleus = nucleus;
    }

    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CpuEntity cpuEntity = (CpuEntity) o;

        if (id != cpuEntity.id) return false;
        if (nucleus != cpuEntity.nucleus) return false;
        if (Double.compare(cpuEntity.frequency, frequency) != 0) return false;
        if (model != null ? !model.equals(cpuEntity.model) : cpuEntity.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + nucleus;
        temp = Double.doubleToLongBits(frequency);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
