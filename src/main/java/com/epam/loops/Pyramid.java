package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int spaces = cathetusLength - 1;
        for(int i = 1; i <= cathetusLength; i++){
            int digit = i;
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < i; j++){
                System.out.print(digit);
                digit--;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(digit);
                digit++;
            }
            System.out.print("\n");

            digit++;
            spaces--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
