package p00._02;

public class Main {
    public static void main(String[] args) {

        int [] arr = new int[100];

        arr[1] = 1;
        arr[2] = 1;

        //1 array 이용
        for (int i = 3; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 1; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //2
        int prepreNum = 1;
        int preNum = 1;
        System.out.print(prepreNum+" ");
        System.out.print(preNum+" ");

        for (int i = 3; i < 10; i++) {
            int num = prepreNum + preNum;
            System.out.print(num + " ");

            prepreNum = preNum;
            preNum = num;
        }

    }
}
