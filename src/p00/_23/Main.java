package p00._23;

// 문자열 뒤집기
public class Main {
    public static void main(String[] args) {

        String input = "ADEFH";
      /*  char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }*/


        char str[] = input.toCharArray();
        char tmp;
        System.out.println(input);
        int len = str.length;

        for (int i = 0; i < len / 2; i++) {
            tmp = str[i];
            str[i] = str[len - i - 1];
            str[len-i-1] = tmp;
        }

        input = new String(str);
        System.out.println(input);


    }
}
