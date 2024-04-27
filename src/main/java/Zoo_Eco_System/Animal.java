package Zoo_Eco_System;

public abstract class Animal implements Animal_Behavior{

    public abstract void eat();

    public void sleep() {
        System.out.println("Most of the mammals sleep for 8-12 hours and birds sleep around 12 hours.");
    }
    public abstract void makeSound();

    public abstract void displayInformation();
}