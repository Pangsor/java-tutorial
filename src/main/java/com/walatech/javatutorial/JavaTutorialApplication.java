package com.walatech.javatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTutorialApplication.class, args);

		// Math
		System.out.println("Max is -> " + Math.max(5,10));
		System.out.println("Min is -> " + Math.min(5,10));
		System.out.println("Sqrt is -> " + Math.sqrt(64));
		System.out.println("Abs is -> " + Math.abs(3));
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println("Random is -> " + randomNum);

		// Reverse
		String originalStr="Hello";
		String reverseStr = "";
		StringBuilder newReverseStr = new StringBuilder();
		for(int i =0; i < originalStr.length();i++){
			reverseStr = originalStr.charAt(i) + reverseStr;
			newReverseStr.insert(0, originalStr.charAt(i));
		}
		System.out.println("String : " + originalStr);
		System.out.println("Reverse String :" + reverseStr);
		System.out.println("New Reverse String :" + newReverseStr);

		// Modifier Private
		Person person = new Person();
		person.setName("Jhon");
		System.out.println("Private modifier -> " + person.getName());

		// Modifier Public
		person.anotherName = "Jhon Doe";
		System.out.println("Public modifier -> " + person.anotherName);
	}

}
