package cn.edu.hzcu.cs.oop.caoxin;

public class Dog extends Animal implements Eat, Bark {
    Dog (String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Class-Dog: Eat");
    }

    @Override
    public void bark() {
        System.out.println("Class-Dog: Bark");
    }
}
