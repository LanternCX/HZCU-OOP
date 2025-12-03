class Fruit {}

class Apple extends Fruit {}

class GoldenDelicious extends Apple {}

class McIntosh extends Apple {}

class Orange extends Fruit {}

public class Lab17T1 {
    public static void main(String[] args) {

        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        System.out.println(fruit instanceof Fruit);
        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDelicious);
        System.out.println(fruit instanceof McIntosh);

        System.out.println(orange instanceof Orange);
        System.out.println(orange instanceof Fruit);
//        System.out.println(orange instanceof Apple);

        System.out.println("fruit - makeAppleCider: CE");
        System.out.println("orange - makeAppleCider: CE");

        System.out.println("orange - makeOrangeJuice: OK");
        System.out.println("fruit - makeOrangeJuice: CE");

        System.out.println("Orange p = new Apple(): CE");
        System.out.println("McIntosh p = new Apple(): CE");
        System.out.println("Apple p = new McIntosh(): OK");
    }
}
