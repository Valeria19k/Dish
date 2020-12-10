package com.company;

public class Plate extends Dish{
    public Plate(){

    }
    public Plate(String material, String color,int amount, int quality){
        super(material, color, amount, quality);
    }
    public void cleanliness(){
        if(quality!=0){
            System.out.println("Тарелка грязная!Надо помыть!");
        }
        else{
            System.out.println("Тарелка блестит от чистоты!");
        }
    }
}
