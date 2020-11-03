package p00._17;

//별 출력2
public class Main {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++){
                if(i>j){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
