package cn.edu.hzcu.cs.oop.caoxin;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Lab23T2 {
    public static void main(String[] args) {
        // Automatically locate testdata.txt in the same directory as this class file.
        Path dataPath = null;

        try {
            // Get URL to this class file
            URL classUrl = Lab23T2.class.getResource("Lab23T2.class");
            if (classUrl != null) {
                URI classUri = classUrl.toURI();
                Path classPath;
                // If running from file system (IDE), the URI scheme will be 'file'
                if ("file".equalsIgnoreCase(classUri.getScheme())) {
                    classPath = Paths.get(classUri);
                    dataPath = classPath.getParent().resolve("testdata.txt");
                }
            }
        } catch (URISyntaxException ignored) {
            // fall through to other strategies
        }

        // Fallback #1: most likely location when running from project root
        if (dataPath == null || !Files.exists(dataPath)) {
            Path alt = Paths.get("src/main/java/cn/edu/hzcu/cs/oop/caoxin/testdata.txt");
            if (Files.exists(alt)) {
                dataPath = alt;
            }
        }

        // Fallback #2: ./testdata.txt relative to current working directory
        if (dataPath == null || !Files.exists(dataPath)) {
            Path cwd = Paths.get(".").toAbsolutePath().normalize();
            Path alt2 = cwd.resolve("testdata.txt");
            if (Files.exists(alt2)) {
                dataPath = alt2;
            }
        }

        if (dataPath == null || !Files.exists(dataPath)) {
            System.err.println("Could not find testdata.txt in class directory, src path, or working directory.");
            System.err.println("Please place testdata.txt next to Lab23T2.class or at src/main/java/cn/edu/hzcu/cs/oop/caoxin/testdata.txt or ./testdata.txt");
            return;
        }

        double sum = 0.0;
        int count = 0;

        // Read whitespace-separated numbers from the located file
        try (Scanner sc = new Scanner(dataPath)) {
            sc.useLocale(Locale.US);
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    double v = sc.nextDouble();
                    sum += v;
                    count++;
                } else {
                    sc.next();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        if (count == 0) {
            System.out.println("No numeric scores found in file.");
            return;
        }

        double average = sum / count;

        System.out.println("Total is " + sum);
        System.out.println("Average is " + average);
    }
}
