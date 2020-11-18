package p00._31;

//팩토리얼 재귀
public class Main {

    //탈출 조건

    public static int calFact(int i) {

        if(i==1){
            return 1;
        }

        return i * calFact(i - 1);
    }


    public static void main(String[] args) {

        int num = 5;
        int ans=0;

        ans = calFact(num);


        System.out.println("ans = " + ans);

    }
}
