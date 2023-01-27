package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        String[] str = ("" + number).split("");
        for(int i = (str.length - 1); i >= 0; i--){
            System.out.print(str[i]);
        }
        System.out.print("\n");
    }
}
