package Oops;
class Animal2 {
    // Parent class method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    // Child class method that overrides the parent class method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal2 animal = new Animal2();  // Create an Animal object
        animal.makeSound();  // Output: Animal makes a sound

        Animal2 dog = new Dog2();  // Create a Dog object (but treat it as an Animal)
        dog.makeSound();  // Output: Dog barks
    }
}

