package p00._08;

//팩토리얼
public class Main {
    public static void main(String[] args) {
        int inputNum = 5;
        int accNum = 1;
        for (int i = 1; i <= inputNum; i++) {
            accNum *= i;
        }
        System.out.println(accNum);
    }
}
