package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type sentence here");
        String sentence = scanner.nextLine();

        System.out.println("There is "+sentence.length() + " characters in this sentence");

        String cSmall = "c";


        if (sentence.indexOf("c") != -1)
        {
            System.out.println("The lower case c is here:" + sentence.indexOf("c"));

        }
        else if(sentence.indexOf("C") != -1)
        {
            System.out.println("The upper case c is here:" + sentence.indexOf("C"));

        }
         else
         {
            System.out.println("There is no character c in this sentence");
        }

        if (sentence.indexOf("x") != -1)
        {
            System.out.println("The lower case x is here:" + sentence.indexOf("x"));

        }
        else if(sentence.indexOf("X") != -1)
        {
            System.out.println("The upper case X is here:" + sentence.indexOf("X"));

        }
        else
        {
            System.out.println("There is no x character in this sentence");
        }
        System.out.println("The first 3 characters are " + sentence.substring(0,3));

        String lastFourDigits = "";

        if (sentence.length() > 4)
        {
            lastFourDigits = sentence.substring(sentence.length() - 4);
        }
        else
        {
            lastFourDigits = sentence;
        }

        System.out.println("The last 4 characters are " + lastFourDigits);
    }
}