package com.company;

public class Fork extends Dish {
    public Fork() {

    }

    public Fork(String material, String color,int amount, int quality){
        super(material, color, amount, quality);
    }

    public void cleanliness(){
        if(quality!=0){
            System.out.println("Вилка грязная!Надо помыть!");
        }
        else{
            System.out.println("Вилка блестит от чистоты!");
        }
    }
}
