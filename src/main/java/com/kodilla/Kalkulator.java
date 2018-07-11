package com.kodilla;

public class Kalkulator {

    int a = 5;
    int b = 2;


    public void counting() {
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.counting();
    }
}
