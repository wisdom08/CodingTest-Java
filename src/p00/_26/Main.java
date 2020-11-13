package p00._26;

// 상수
public class Main {
    public static void main(String[] args) {
        int a = 734;

        int arr[] = new int[3];
        int len = 0;
        do{
            arr[len] = a % 10;
            a/=10;
            len++;
        } while(a>0);

        int result = 0;
        int mux = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i]*mux;
            mux*=10;
        }

        System.out.println("result = " + result);

    }
}

