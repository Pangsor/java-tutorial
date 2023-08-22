package com.walatech.javatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTutorialApplication.class, args);

		// Math
		System.out.println(Math.max(5,10));
		System.out.println(Math.min(5,10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(3));
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(randomNum);

		// Reverse
		String originalStr="Hello";
		String reverseStr = "";
		for(int i =0; i < originalStr.length();i++){
			reverseStr = originalStr.charAt(i) + reverseStr;
		}
		System.out.println("Reverse String :" + reverseStr);
	}

}
