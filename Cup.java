package com.company;

public class Cup extends Dish {
    public Cup() {

    }

    public Cup(String material, String color,int amount, int quality){
        super(material, color, amount, quality);
    }

    public void cleanliness(){
        if(quality!=0){
            System.out.println("Кружка грязная!Надо помыть!");
        }
        else{
            System.out.println("Кружка блестит от чистоты!");
        }
    }
}
