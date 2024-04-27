package Zoo_Eco_System;
public class Elephant extends Mammal{
    public Elephant(String type, String name, String color, int age, double weight) {
        super(type, name, color, age, weight);
    }
    @Override
    public void eat() {
        System.out.println("Elephants eat grass, fruits and roots");
    }
    @Override
    public void makeSound() {
        System.out.println("Elephant sound is loud");
    }
    @Override
    public void displayInformation() {
        System.out.println("This animal type is " + type + ", name is " + name + ", color is " + color + ", age is " + age + ", weight is " + weight);
    }

}