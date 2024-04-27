package Zoo_Eco_System;
public class TestAnimalEcosystem {
    public static void main(String[] args) {
        Animal [] animals = {
                new Lion("Lion", "Leo", "sandy", 6, 130.5),
                new Elephant("Elephant", "Dumbo", "grey", 10, 230.3),
                new Parrot("Parrot", "Tico Mango", "green and red", 10, 4.1),
                new Eagle("Eagle", "Ricco", "grey and black", 4, 20.2)
        };
        for(Animal a:animals){
            a.eat();
        }
        System.out.println("      ***********     ");
        for(Animal a:animals){
            a.makeSound();
        }
        System.out.println("      ***********     ");
        for(Animal a:animals){
            a.sleep();
        }
        System.out.println("      ***********     ");
        for(Animal a:animals){
            a.displayInformation();
        }
    }
}