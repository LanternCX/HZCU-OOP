package cn.edu.hzcu.cs.oop.caoxin;

public class Lab21T1 {

    static void test(int type) throws Exception {
        try {
            System.out.println("statement1");

            if (type == 1)
                throw new Exception1();
            else if (type == 2)
                throw new Exception2();

            System.out.println("statement3");
        }
        catch (Exception1 e) {
            System.out.println("catch Exception1");
        }
        finally {
            System.out.println("statement4 (finally)");
        }

        System.out.println("statement5");
    }

    public static void main(String[] args) {
        // 情况1：无异常
        try {
            System.out.println("=== no exception ===");
            test(0);
        } catch (Exception e) {
            System.out.println("outer catch");
        }

        // 情况2：Exception1
        try {
            System.out.println("\n=== Exception1 ===");
            test(1);
        } catch (Exception e) {
            System.out.println("outer catch");
        }

        // 情况3：Exception2
        try {
            System.out.println("\n=== Exception2 ===");
            test(2);
        } catch (Exception e) {
            System.out.println("outer catch");
        }
    }
}

class Exception1 extends Exception {}
class Exception2 extends Exception {}
