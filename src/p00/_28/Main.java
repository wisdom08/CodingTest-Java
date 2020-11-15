package p00._28;

// 10진수를 2~16진수 변환하기
public class Main {
    public static void main(String[] args) {

        char n[] = new char[100];

        int num = 19;
        int notation = 8;

        int i=0;
        while(num>0){
            int tmp = num % notation;

            if(tmp>=10 && tmp<=15){
                n[i] = (char) ('A'+(tmp-10));
            } else {
                n[i] = (char) ('0'+tmp);
            }
            num/=notation;
            i++;
        }

        for (; i >= 0; i--) {
            System.out.print(n[i]);
        }

    }
}
