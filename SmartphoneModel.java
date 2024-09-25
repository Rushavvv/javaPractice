package com.example.model;

import java.util.ArrayList;

/**
 *
 * @author rushav
 */
public class SmartphoneModel {
    private String modelCode;
    private double price;
    private boolean cardSlot;
    private ArrayList<String> color;
        
    

    public SmartphoneModel(String modelCode, double price, boolean cardSlot, ArrayList<String> color) {
        this.modelCode = modelCode;
        this.price = price;
        this.cardSlot = cardSlot;
        this.color = color;
    }

    public String getModelCode() {
        return modelCode;
    }

    public double getPrice() {
        return price;
    }

    public boolean isCardSlot() {
        return cardSlot;
    }

    public ArrayList<String> getColor() {
        return color;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCardSlot(boolean cardSlot) {
        this.cardSlot = cardSlot;
    }

    public void setColor(ArrayList<String> color) {
        this.color = color;
    }
    
    
    
}
