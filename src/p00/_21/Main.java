package p00._21;

import com.sun.jdi.Value;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

// 중복된 수 제거
public class Main {
    public static void main(String[] args) {
        //1에서 100까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하기
        //boolean arr[] = new boolean [100]; 불린 배열로도 풀 수 있다.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] nums = input.split(" ");
        int[] arr = new int[100];
        int value = 0 ;
        for (int i = 0; i < nums.length; i++) {
            value = Integer.parseInt(nums[i]);
            arr[value]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr[i] != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
