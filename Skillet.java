package com.company;

public class Skillet extends Dish {
    public Skillet() {

    }

    public Skillet(String material, String color,int amount, int quality){
        super(material, color, amount, quality);
    }

    public void cleanliness(){
        if(quality!=0){
            System.out.println("Сковорода грязная!Надо помыть!");
        }
        else{
            System.out.println("Сковорода блестит от чистоты!");
        }
    }

    public void hot(){
        System.out.println("Сковорода горячая. Не обожгись!");
    }
}
