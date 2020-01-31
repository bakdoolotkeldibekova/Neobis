package com.company;

import javax.xml.crypto.Data;

public class Order {
    private int id;
    private int phoneNumOfClient;
    private Computer computer;
    private Payment payment;
    private Data date;

    public Order(int id, int phoneNumOfClient, Payment payment, Data date, Computer computer) {
        this.id = id;
        this.phoneNumOfClient = phoneNumOfClient;
        this.payment = payment;
        this.date = date;
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumOfClient() {
        return phoneNumOfClient;
    }

    public void setPhoneNumOfClient(int phoneNumOfClient) {
        this.phoneNumOfClient = phoneNumOfClient;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
