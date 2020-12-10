package com.company;

public  abstract class Dish {
    String material;
    String color;
    int amount;
    int quality;

    public Dish(){

    }
    public Dish(String material, String color, int amount, int quality){
        this.material=material;
        this.color=color;
        this.amount=amount;
        this.quality=quality;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    public int getQuality() {
        return quality;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void serving(){
        System.out.println("Посуда разложена на столе!");
    }
    public abstract void cleanliness();
}
