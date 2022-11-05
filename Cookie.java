package com.company;

public class Cookie extends DesertShop{
    int totalCookie = 400;
    int price = 50;

    public void addItem(int number) {
        totalCookie = totalCookie+ number;
        System.out.println("total cookies int the store =" + totalCookie);
    }

    //override
    public void getCost(int number) {
        cost = number * price;
        totalcost = cost + tax * number;
        System.out.println("the cost of " + number + "Cookie is " + number + "*" + price + "=" + cost);
        System.out.println("Tax is : " + (tax * number) + "\nTotalcost is : " + totalcost);
    }
}

