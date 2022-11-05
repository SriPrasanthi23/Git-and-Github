package com.company;
import java.lang.*;
import java.util.*;
public class DesertShop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cookie Cookie = new Cookie();

        System.out.println("Choose 1 if you are owner/nChoose 2 if you are Customer");
        int choose = s.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter the item you want to buy: ");
                String str = s.next();
                if (str.equalsIgnoreCase("Cokkie")) {
                    System.out.println("enter the number of cookies you want to add: ");
                    int numbers = s.nextInt();

                }
                else if (str.equalsIgnoreCase("Candy")) {
                    System.out.println("enter the number of Candies you want");
                    int numbers = s.nextInt();

                }
                else if (str.equalsIgnoreCase("Icecream")) {
                    System.out.println("Enter the number of Icecream you want: ");
                    int numbers = s.nextInt();

                }
        }
    }