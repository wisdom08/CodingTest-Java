package p00._36;

import java.util.Scanner;

// 2진수 변환(재귀Ver)
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        change(input);

    }

    private static void change(int n) {

        if (n / 2 == 0) {
            System.out.print(n);
            return;
        }

        change(n / 2);
        System.out.print(n%2);
    }
}
