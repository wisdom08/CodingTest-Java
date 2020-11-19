package p00._32;

import java.util.Scanner;

// 누적합 재귀
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 0;

        start = sc.nextInt();
        end = sc.nextInt();

        int ans = 0;

        ans = calAccSum(start, end);

        System.out.println("ans = " + ans);
    }

    private static int calAccSum(int start, int end) {

        // 1 3 => 1+2+3=6

        if (start == end) {
            return start;
        }

        return start + calAccSum(start + 1, end);
    }
}
