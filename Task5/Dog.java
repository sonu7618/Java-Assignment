/* Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances Add commentMore actions
of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods 
and print the updated values. */

public class Dog {
    private String name;
    private String breed;

    // constructor
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    // getter
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    // method
    public void printValues(){
        System.out.println("Dog Name: " + getName());
        System.out.println("Dog Breed: " + getBreed());
    }
}

class Dogimp{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy", "Golden Retriever");
        Dog dog2 = new Dog("Lucy", "Husky");

        dog1.printValues();
        System.out.println("Updated dog1 info");
        dog1.setName("Bucky");
        dog1.setBreed("BullDog");

        dog1.printValues();

        dog2.printValues();
        System.out.println("Updated dog2 info");
        dog2.setName("Bella");
        dog2.setBreed("Pug");

        dog2.printValues();
    }
}