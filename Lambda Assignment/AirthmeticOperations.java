package com.company;
interface operations
{
    int operation1(int n1, int n2);
}
 class ArithmeticOpe {
    public static void main(String[] args) {
        operations addition = (int n1, int n2) -> n1 + n2;
        operations subtraction = (int n1, int n2) -> n1 - n2;
        operations multiplication = (int n1, int n2) -> n1 * n2;
        operations division = (int n1, int n2) -> n1 / n2;
        System.out.println("Addition of 10 and 5 :   " + addition.operation1(10, 5));
        System.out.println("Subtraction of 10 and 5 :   " + subtraction.operation1(10, 5));
        System.out.println("Multiplication of 10 and 5 :  " + multiplication.operation1(10, 5));
        System.out.println("Division of 10 and 5 :   " + division.operation1(10, 5));
    }
}


