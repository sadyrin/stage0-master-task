package com.epam.langSyntax;

public class DigitsSumCalculator {
    public  void calculateSum(int number) {
        int sum = 0;
        String[] str = ("" + number).split("");
        for(String s : str){
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
