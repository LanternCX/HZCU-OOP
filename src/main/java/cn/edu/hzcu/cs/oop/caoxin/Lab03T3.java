package cn.edu.hzcu.cs.oop.caoxin;

import java.util.*;

public class Lab03T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String str = input.nextLine();
        System.out.println("Enter string s2: ");
        String tag = input.nextLine();

        System.out.printf("\"%s\" is %sa substring of \"%s\".\n", tag, str.indexOf(tag) > 0 ? "" : "not ", str);
    }
}
