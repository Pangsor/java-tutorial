package com.walatech.javatutorial.polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: meong meong");
    }
}

class Bird extends Animal {
    public void animalSound() {
        System.out.println("The bird says: cuit cuit");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new Cat();  // Create a Pig object
        Animal myBird = new Bird();  // Create a Dog object
        myAnimal.animalSound();
        myCat.animalSound();
        myBird.animalSound();
    }
}
