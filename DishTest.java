package com.company;

public class DishTest {
    public static void main (String[] args){
        Plate a= new Plate("Стекло","Прозрачный",6,2);
        Fork b = new Fork("Серебро","Серебряный",6,0);
        Skillet k = new Skillet("Чугун","Чёрный",1,0);
        k.hot();
        System.out.println("Количество посуды данного вида : "+ a.getAmount());
        b.serving();
        a.cleanliness();
    }
}
