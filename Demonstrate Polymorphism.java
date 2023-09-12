import java.io.*;
class Animal {
    public void AnimalSound() {
        System.out.println("An animal can make sounds");
    }
}
class Cow extends Animal {
    public void AnimalSound() {
        System.out.println("A cow sounds-maa...");
    }
}
class Cat extends Animal {
    public void AnimalSound() {
        System.out.println("A cat sounds-meow...");
    }
}
public class PolymorphismDemo {
    public static void main(String args[]) {
        Animal an = new Animal();
        Cow cow = new Cow();
        Cat cat = new Cat();
        an.AnimalSound();
        cow.AnimalSound();
        cat.AnimalSound();
    }
}
