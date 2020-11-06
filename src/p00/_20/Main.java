package p00._20;

// 3,6,9 출력
public class Main {

    public static int getNum (int i ){

        int cnt = 0;

        while (i > 0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                cnt++;
            }
            i/=10;

        }

        return cnt;
    }

    public static void main(String[] args) {
        // 100까지 369게임 진행하기

        int n = 100;
        int cnt = 0;

        for (int i = 1; i <= 100; i++) {
            cnt = getNum(i);

            if(cnt == 0){
                System.out.print(i+" ");
            } else {
                for (int j = 0; j < cnt; j++) {
                    System.out.print("짝");
                }
                System.out.print(" ");
            }

        }

    }
}