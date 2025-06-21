/* You are developing a game in Java. The game has a base class Character with a method attack() that displays the basic attack action of the c
haracter. Now, you need to create two derived classes Warrior and Mage that inherit from Character and override the attack() method to display 
their specific attack actions. Write the code to demonstrate method overriding for character attacks in the game. */

class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " attacks with a basic strike!");
    }
}

class Warrior extends Character {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a sword with great force!");
    }
}

class Mage extends Character {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a powerful fireball!");
    }
}

public class Game {
    public static void main(String[] args) {
        Character baseCharacter = new Character("Generic Hero");
        Warrior warrior = new Warrior("Arthas");
        Mage mage = new Mage("Merlin");

        baseCharacter.attack();  
        warrior.attack();       
        mage.attack();           
    }
}

