package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int spaces = cathetusLength - 1;
        for(int i = 1; i <= cathetusLength; i++){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
            spaces--;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
