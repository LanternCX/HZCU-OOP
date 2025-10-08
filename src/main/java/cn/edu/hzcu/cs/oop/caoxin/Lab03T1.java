package cn.edu.hzcu.cs.oop.caoxin;

import java.util.*;

public class Lab03T1 {
    private static int judge(int a, int b) {
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        return x == 0 && y == 2 ? 0 : y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("rock(0), sissor(1), paper(2): ");

        int usr;
        while (true) {
            usr = input.nextInt();
            if (usr < 0 || usr >= 3) {
                System.out.println("Invalid input! Please enter another digit: ");
            } else {
                break;
            }
        }

        Random rand = new Random();
        int sys = Math.abs(rand.nextInt() % 3);

        HashMap<Integer, String> nameMap = new HashMap<>() {{
            put(0, "Rock");
            put(1, "Paper");
            put(2, "Scissors");
        }};

        String ans = "The computer is " + nameMap.get(sys) + ". You are " + nameMap.get(usr);
        int result = judge(sys, usr);

        if (usr == sys) {
            ans += " too. It is a draw";
        } else if (result == usr) {
            ans += ". You won \\o/";
        } else {
            ans += ". You lost QwQ";
        }
        System.out.println(ans);
    }
}
