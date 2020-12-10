package w01;

import java.util.ArrayList;
import java.util.List;

public class leetcode_Longest_Substring_Without_Repeating_Characters_bjh {
    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");

    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            List<Character> list = new ArrayList<>();
            for (int j = i; j < array.length; j++) {
                list.add(array[j]);
            }
            if(list.size()>result) result = list.size();
        }
        System.out.println("result = " + result);
        return result;
    }
}
