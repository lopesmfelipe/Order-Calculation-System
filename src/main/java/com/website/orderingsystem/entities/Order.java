package com.website.orderingsystem.entities;

public class Order {  // ENTITY
    private int code;
    private double basicValue;
    private double discount;

    public Order(){
    }

    public Order(int code, double basic, double discount){
        this.code = code;
        this.basicValue = basic;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basicValue;
    }

    public void setBasic(double basic) {
        this.basicValue = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
