package cn.edu.hzcu.cs.oop.caoxin;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab23T3 {
    public static void main(String[] args) {
        Path file = Paths.get("Exercise1215.txt");

        if (!Files.exists(file)) {
            try (BufferedWriter writer = Files.newBufferedWriter(file)) {
                Random rnd = new Random();
                for (int i = 0; i < 100; i++) {
                    int value = rnd.nextInt(100);
                    writer.write(Integer.toString(value));
                    if (i < 99) writer.write(' ');
                }
                writer.newLine();
                System.out.println("Created file: " + file.toAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error creating/writing file: " + e.getMessage());
                return;
            }
        } else {
            System.out.println("Using existing file: " + file.toAbsolutePath());
        }

        List<Integer> numbers = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    numbers.add(sc.nextInt());
                } else {
                    sc.next();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        if (numbers.isEmpty()) {
            System.out.println("No integers found in the file.");
            return;
        }

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(' ');
            }
        }

        if (numbers.size() % 10 != 0) System.out.println();
    }
}
