package com.walatech.javatutorial;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        String original;
        StringBuilder reverse = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Please input String / Number ...");
        original = input.nextLine();
        int length = original.length();
        for(int x = length - 1; x >= 0; x--){
            reverse.append(original.charAt(x));
        }
        if (original.equals(reverse.toString())) {
            System.out.println("Palindrom");
        }else {
            System.out.println("Bukan Palindrom");
        }
    }
}
