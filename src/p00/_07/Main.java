package p00._07;
//소수 판별
public class Main {
    public static void main(String[] args) {
        int n = 13 ;
        boolean isPrimeNumber = true;

        for (int i = 2; i < n/2; i++) {
            if(n%i == 0){
                isPrimeNumber = false;
            }
        }

        if(isPrimeNumber){
            System.out.println(n+" :::: 소수입니다.");
        } else {
            System.out.println(n+" :::: 소수가 아닙니다.");
        }
    }
}
