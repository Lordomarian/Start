package org.example;

public class Calc {
    public int add (int... array){
        int sum = 0;
        for (int a:array) {
            sum += a;
        }
        return sum;
    }
}
