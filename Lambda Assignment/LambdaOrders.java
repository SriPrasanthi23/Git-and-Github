package com.company;

import java.util.*;
import java.util.function.Predicate;

interface LambdaOrders {
    void criteria(int price);
}

class LambdaProgram2 {
    public static void main(String[] args) {
        //Prediction<Integer> pr=6->(e>10000);
        //System.out,println(pr.test(15000));
        LambdaOrders pr = a -> {
            if(a>10000){
            System.out.println("completed");
        }
        else {
            System.out.println("not completed");
        }
    }

    ;
    pr.criteria(10002);
}
}
