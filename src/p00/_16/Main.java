package p00._16;

//별 출력1
public class Main {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
