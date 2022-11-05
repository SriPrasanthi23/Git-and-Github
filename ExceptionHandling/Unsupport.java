package com.company;
import java.util.*;

 class UnSupport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }
    }
}

