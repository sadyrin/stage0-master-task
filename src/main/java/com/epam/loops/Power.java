package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;
        if(power == 0) result = 1;
        else if(power == 1) result = numberToPrint;
        else {
            for(int i = 2; i <= power; i++){
                result *= numberToPrint;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
