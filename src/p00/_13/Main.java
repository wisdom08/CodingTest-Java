package p00._13;
// 숫자 사각형4
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int start = 1;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                //arr[i][j] = (i+1) * (j+1);

                if(j==0){
                    arr[i][0] = start;
                    start++;
                } else {
                    arr[i][j] = arr[i][j-1]+(i+1);
                }
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
