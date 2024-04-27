package Zoo_Eco_System;

public class Bird extends Animal{

    protected String type;
    protected String name;
    protected String color;
    protected int age;
    protected double weight;
    public Bird(String type, String name, String color, int age, double weight) {
        this.type=type;
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    @Override
    public void eat() {
        System.out.println("Birds eat seeds, fruits and drink water");
    }

    @Override
    public void makeSound() {
        System.out.println("Birds like to chirp in the morning and evening");
    }
    @Override
    public void displayInformation(){

    };

}