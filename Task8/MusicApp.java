/* You are designing a music application where different musical instruments, such as Piano, Guitar, and Violin, have unique ways of producing 
sound. Implement a Java program using polymorphism where each instrument has a playSound() method that behaves differently for each type of 
instrument. */

abstract class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void playSound();
}

class Piano extends Instrument {
    public Piano() {
        super("Piano");
    }

    @Override
    public void playSound() {
        System.out.println(name + " plays a soothing melody with keys.");
    }
}

class Guitar extends Instrument {
    public Guitar() {
        super("Guitar");
    }

    @Override
    public void playSound() {
        System.out.println(name + " strums vibrant chords.");
    }
}

class Violin extends Instrument {
    public Violin() {
        super("Violin");
    }

    @Override
    public void playSound() {
        System.out.println(name + " produces a rich and expressive tone with a bow.");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano(),
            new Guitar(),
            new Violin()
        };

        for (Instrument instrument : instruments) {
            instrument.playSound();
        }
    }
}

