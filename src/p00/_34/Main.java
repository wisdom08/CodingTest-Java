package p00._34;

import java.util.Scanner;

//피보나치 재귀
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = pibo(num);
        System.out.println("ans = " + ans);
    }

    private static int pibo(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }

        return pibo(num-1)+ pibo(num-2);
    }
}
