package p00._12;

// 숫자 사각형3
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int start = 1;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr [j][i] = start;
                start++;
                // arr[j][i] = i*n + j+1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
