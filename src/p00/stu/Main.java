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

        boolean con = true;
        while (con) {
            System.out.println("계속 검색? y // 종료? n");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            if (s.equals("y")) {
                System.out.println("계속 검색");
                con = true;

                System.out.println("이름 입력해주세요.");
                String name = sc.nextLine();

                int cnt = 0;
                for (Student student : list) {
                    if (name.equals(student.getName())) {
                        System.out.println(name + "의 학번은 "+ student.getNo());
                        cnt++;
                    }
                }

                if (cnt == 0) {
                    System.out.println("없는 학생입니다.");
                }


            } else {
                System.out.println("종료");
                con = false;
            }

        }
    }
}
