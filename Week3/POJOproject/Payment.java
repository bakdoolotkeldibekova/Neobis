package com.company;

public class Payment {
    private int id;
    private double price;
    private boolean isWithCard;

    public Payment(int id, double price, boolean isWithCard) {
        this.id = id;
        this.price = price;
        this.isWithCard = isWithCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWithCard() {
        return isWithCard;
    }

    public void setWithCard(boolean withCard) {
        isWithCard = withCard;
    }
}
