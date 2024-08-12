package com.example;

import org.apache.commons.math3.random.RandomDataGenerator;


public class Main {
    public static void main(String[] args) {
        
        RandomDataGenerator rdg = new RandomDataGenerator();

        for (int i=0 ; i<1000; i++){
            double number =rdg.nextBeta(6, 5)*3;
            int result = (int) (number+1);
            System.out.println(String.format("Prize behind the %s door", result));
        }

        // for (int i=0 ; i<1000; i++){
        //     double number =rdg.nextCauchy(3, 5)*3;
        //     int result = (int) (number+1);
        //     System.out.println(String.format("Prize behind the %s door", result));
        // }
        // for (int i=0 ; i<1000; i++){
        //     double number =rdg.nextGaussian(3, 5)*3;
        //     int result = (int) (number+1);
        //     System.out.println(String.format("Prize behind the %s door", result));
        // }
        // for (int i=0 ; i<1000; i++){
        //     double number =rdg.nextBinomial(0, 1)*3;
        //     int result = (int) (number+1);
        //     System.out.println(String.format("Prize behind the %s door", result));
        // }

        
    }
}