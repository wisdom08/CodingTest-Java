package p00.stu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student stu1 = new Student("사오정", 1234);
        Student stu2 = new Student("저팔계", 1222);
        Student stu3 = new Student("사람", 1214);
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("계속 검색 y // 종료 n");
            String input = sc.nextLine();

            if (input.equals("y")) {
                System.out.println("검색 시작! 이름 입력해주세요.");
                String name = sc.nextLine();

                boolean flag = false;

                for (Student stu : list) {
                    if (stu.getName().equals(name)) {
                        System.out.println("학번은 " + stu.getNo());
                        flag = true;
                    }
                }

                if (!flag) {
                    System.out.println("해당 학생이 없습니다.");
                }


            } else if (input.equals("n")) {
                break; //가까운 while문 탈출
            }

        }
        System.out.println("종료");
    }
}
