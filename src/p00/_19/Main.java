package p00._19;

// 거듭 제곱
public class Main {
    public static void main(String[] args) {
        // n의 m승 구하기
        int n = 10;
        int m = 3;
        int result = 1;

        for (int i = 0; i < m; i++) {
            result *= n;
        }

        System.out.println(result);

    }
}
