package p00._35;

import java.util.Scanner;

// 숫자 추출 (재귀 Ver.)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        extract(input);
    }

    private static void extract(int n) {

        if (n / 10 == 0) {
            System.out.println(n);
            return;
        }

        extract(n/10);
        System.out.println(n%10);
    }
}
