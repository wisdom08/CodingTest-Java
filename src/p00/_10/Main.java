package p00._10;

//숫자 사각형1
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int start = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", start);
                start++;
            }
            System.out.println();
        }

    }
}
      