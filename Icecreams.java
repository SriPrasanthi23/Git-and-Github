package com.company;

 class Icecreams extends DesertShop{
    int totalicecreams = 500;
    int price= 50;

    public void addItem(int number) {
        totalicecreams = totalicecreams + number;
        System.out.println("totalicecreams=" + totalicecreams);
    }

    public void getCost(int number) {
        cost=number+price;
        totalcost= cost+tax * number;
        System.out.println("the cost of "+number+"icecream is"+number+"*"+price"*"cost);
        System.out.println("Tax is : "+(tax*number)+"\nTotal cost="+totalcost);
    }
}
