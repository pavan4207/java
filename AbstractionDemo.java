import java.io.*;
import java.util.*;
abstract class Animal {
    public abstract void AnimalSound();
    public void sleep() {
        System.out.println("Zzzz...");
    }
}
class Cow extends Animal {
    public void AnimalSound() {
        System.out.println("The cow sounds-amba...");
    }
}
public class AbstractionDemo {
    public static void main(String args[]) {
        Cow c = new Cow ();
        c.AnimalSound();
        c.sleep();
    }
}
