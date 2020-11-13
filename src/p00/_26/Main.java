package p00._26;

// 상수
public class Main {
    public static void main(String[] args) {
        int a = 734;
        int b = 893;

        int arrA[] = new int [3];
        int arrB[] = new int [3];

        int lenA = 0;
        do{
            arrA[lenA] = 0;
            a /= 10;
            lenA++;
        } while(a>0);

        int tranA = 0;
        int mux = 1;

        for (int i = arrA.length - 1; i >= 0; i--) {
            tranA += arrA[i]*mux;
            mux*=10;
        }

        System.out.println("tranA="+tranA);


    }
}
