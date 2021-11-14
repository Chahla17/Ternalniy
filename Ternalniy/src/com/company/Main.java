package com.company;

public class Main {

    private static int number;

    public static void main(String[] args) {
        for (int number = -5; number <= 5; number++) ;
        {
            int absval = number < 0 ? -number : number;
            System.out.println("Абсолютное значение равно " + absval);
        }
    }
}
