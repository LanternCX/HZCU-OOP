package cn.edu.hzcu.cs.oop.caoxin;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class Lab23T1 {
    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "src/main/java/cn/edu/hzcu/cs/oop/caoxin/Loan.java";
        Path path = Paths.get(fileName);

        if (!Files.exists(path)) {
            System.err.println("File not found: " + fileName);
            return;
        }

        try {
            String content = Files.readString(path);
            long characters = content.length();

            long lines = Files.lines(path).count();

            long words = 0;
            try (Scanner sc = new Scanner(content)) {
                while (sc.hasNext()) {
                    sc.next();
                    words++;
                }
            }

            System.out.println("File " + path.getFileName() + " has");
            System.out.println(characters + " characters");
            System.out.println(words + " words");
            System.out.println(lines + " lines");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
