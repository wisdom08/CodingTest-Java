package p00._03;

import java.util.Scanner;

//가장 많이 출현한 수 출력하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []inputNum = new int[10];
        for (int i=0; i<10 ; i++) {
            inputNum[i] = sc.nextInt();
        }

        int[] mode = new int[10];

        for (int i = 0; i < 10; i++) {
            mode[inputNum[i]]++;
        }

        int modeNum = 0; //최빈수
        int modeCnt = 0; //최빈수가 나온 횟수

        for (int i = 1; i < 10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println("최빈수는 "+modeNum+"이고 cnt는 "+modeCnt+"입니다.");

    }
}
