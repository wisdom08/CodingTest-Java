package ch01;

import java.util.HashSet;

public class JewelsAndStones {

    public static void main(String[] args) {
        String j = "aA";
        String s = "aAAbbbb";
        System.out.println(solve(j, s));
    }

    private static int solve(String j, String s) {
        HashSet<Character> set = new HashSet<>();
        for (char temp : j.toCharArray()) {
            set.add(temp);
        }

        int count = 0;

        for (char temp : s.toCharArray()) {
            if (set.contains(temp)) {
                count++;
            }
        }

        return count;
    }
}
