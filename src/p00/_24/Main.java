package p00._24;


//평균보다 넘은 학생들의 비율을 출력
public class Main {
    public static void main(String[] args) {
        int num = 7;
        int[] arr = {100, 95, 90, 80, 70, 60, 50};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        double avg = (double) sum/num;
        System.out.println("avg = " + avg);

        int cnt = 0;

        for (int i : arr) {
            if (i > avg) {
                cnt++;
            }
        }
        System.out.println("cnt = " + cnt);

        System.out.println("결과::::: " + (double) cnt / num * 100);


    }
}
