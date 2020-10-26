package p00._09;

import java.util.Scanner;

//각 자릿수 합 구하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while(n>0){
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);

    }
}
