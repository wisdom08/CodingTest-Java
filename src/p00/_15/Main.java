package p00._15;

import java.util.Scanner;

// 구구단1
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            for (int dan = n; dan <= m; dan++) {
                //System.out.print(dan+"*"+i+"=" + dan*i+" ");
                System.out.printf("%d*%d=%d ", dan, i,dan*i);
            }
            System.out.println();
        }

    }
}
