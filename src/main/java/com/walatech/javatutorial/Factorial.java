package com.walatech.javatutorial;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        int fact = 1;
        for(int x = 1; x <= number; x++){
            fact *= x;
        }
        System.out.println("Factorial Using Loop from this number " + number + " = " + fact);

        fact = factorial(number);
        System.out.println("Factorial Using Recursive from this number " + number + " = " + fact);
    }

    private static int factorial(int number){
        if(number == 0){
            return 1;
        }else {
            return (number * factorial(number - 1));
        }
    }
}
