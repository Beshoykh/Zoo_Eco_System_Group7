package Zoo_Eco_System;
public class Eagle extends Bird{
    public Eagle(String type, String name, String color, int age, double weight){
        super(type, name, color, age, weight);
    }
    @Override
    public void eat(){
        System.out.println("Eagle enjoys eating fish and fresh meat");
    }
    @Override
    public void makeSound(){
        System.out.println("SCREEEEEEEE eagle is screeching");
    }
    @Override
    public void displayInformation() {
        System.out.println("This animal type is " + type + ", name is " + name + ", color is " + color + ", age is " + age + ", weight is " + weight);
    }
}