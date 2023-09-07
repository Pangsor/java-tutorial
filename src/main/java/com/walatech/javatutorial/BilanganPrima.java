package com.walatech.javatutorial;

public class BilanganPrima {

    public static void main(String[] args) {
        boolean isPrima = true;
        int i =2;
        while(i <= 20){
            int j = 2;
            while (j < i){
                if(i % j == 0){
                    isPrima = false;
                    break;
                }
                j++;
            }
            if (isPrima){
                System.out.println(i + " Bilangan Prima");
            }
            i++;
            isPrima = true;
        }
    }
}
