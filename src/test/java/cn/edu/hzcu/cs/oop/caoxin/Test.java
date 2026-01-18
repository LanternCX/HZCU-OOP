package cn.edu.hzcu.cs.oop.caoxin;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void IO() throws IOException {
        throw new IOException();
    }

    public static void Runtime() throws RuntimeException {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
//        int t = (int)false;
        try {
            Test.IO();
            Test.Runtime();
        } catch (IOException io) {
            System.out.println(Arrays.toString(io.getStackTrace()));
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        } finally {
            System.out.println("Finished IO test.");
        }
    }
}
