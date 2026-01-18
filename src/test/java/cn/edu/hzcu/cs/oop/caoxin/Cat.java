package cn.edu.hzcu.cs.oop.caoxin;

public class Cat extends Animal implements Eat {
    Cat (String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Class-Cat: Eat");
    }
}
