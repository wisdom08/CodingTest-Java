package p00._30;

// 더하기 & 마이너스
public class Main {
    public static void main(String[] args) {
        int num = 9;
        boolean flag = true;
        for (int i = 1; i <= num; i++) {
            // 1+2-3+4

            if (i == num) {
                System.out.print(i);
                break;
            }

            if (flag) {
                System.out.print(i+"+");
                flag = !flag;
            } else {
                System.out.print(i+"-");
                flag = !flag;
            }
        }
    }
}
