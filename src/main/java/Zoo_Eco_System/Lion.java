package Zoo_Eco_System;

public class Lion extends Mammal{
    public Lion(String type, String name, String color, int age, double weight) {
        super(type, name, color, age, weight);
    }
    @Override
    public void eat() {
        System.out.println("Lions eat meat from hunting");
    }
    @Override
    public void makeSound() {
        System.out.println("Lion sound is roaring");
    }
    @Override
    public void displayInformation() {
        System.out.println("This animal type is " + type + ", name is " + name + ", color is " + color + ", age is " + age + ", weight is " + weight);
    }
}