package cn.edu.hzcu.cs.oop.caoxin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Lab23T4 {
    public static void main(String[] args) {
        String urlStr = "https://www.baidu.com/robots.txt";
        long words = 0;

        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("User-Agent", "Java/1.8");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
                 Scanner sc = new Scanner(reader)) {
                while (sc.hasNext()) {
                    sc.next();
                    words++;
                }
            }

            System.out.println("The number of words is " + words);
        } catch (Exception e) {
            System.err.println("Failed to fetch or process URL: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
