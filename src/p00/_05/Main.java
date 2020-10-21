package p00._05;

//대문자는 소문자로, 소문자는 대문자로 변환
public class Main {
    public static void main(String[] args) {
        String input = "helloWorlD";
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] + ('A' - 'a'));
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] - ('A' - 'a'));
            }
        }
        System.out.print(chars);

    }
}
