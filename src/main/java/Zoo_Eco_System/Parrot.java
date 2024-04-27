package Zoo_Eco_System;
public class Parrot extends Bird{
    public Parrot(String type, String name, String color, int age, double weight){
        super(type, name, color, age, weight);
    }
    @Override
    public void eat(){
        System.out.println("Parrots love pistachios as a treat");
    }
    @Override
    public void makeSound(){
        System.out.println("Squaa squaawwwwk Parrot is screeching");
    }
    @Override
    public void displayInformation() {
        System.out.println("This animal type is " + type + ", name is " + name + ", color is " + color + ", age is " + age + ", weight is " + weight);
    }
}