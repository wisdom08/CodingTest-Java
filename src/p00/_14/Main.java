package p00._14;

//숫자 개수 출력
public class Main {
    public static void main(String[] args) {
        int n = 421314218;
        int[] arr = new int[10];

        while (n > 0) {
            arr[n % 10]++;
            n/=10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i+": "+arr[i]);
        }


    }
}
