package com.company;

    public class Airthematic {
        public static void main(String[] args) {
            try {
                int a = 0;
                int b = 7 / a;
                System.out.println(a);
                System.out.println(b);
                System.out.println("After Exception");
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
            System.out.println("After catch statement");
        }
    }
