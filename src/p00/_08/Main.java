package p00._08;

//팩토리얼
public class Main {
    public static void main(String[] args) {
        int inputNum = 5;
        int result = 1;
        for (int i = 1; i <= inputNum; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
