package Zoo_Eco_System;

public class Mammal extends Animal{

    protected String type;
    protected String name;
    protected String color;
    protected int age;
    protected double weight;
    public Mammal(String type, String name, String color, int age, double weight) {
        this.type=type;
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    @Override
    public void eat() {
        System.out.println("Mammals eats a lot");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammals are making sounds");
    }
    @Override
    public void displayInformation() {

    }

}
