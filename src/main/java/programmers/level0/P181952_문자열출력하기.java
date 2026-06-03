package main.java.programmers.level0;

public class P181952_문자열출력하기 {
    static class Solution {
        public String solution(String str1, String str2) {
            String answer = "";

            for (int i = 0; i < str1.length(); i++) {
                // 문자열.charAt(i)을 사용하면 특정 인덱스의 문자를 가져올 수 있다.
                answer += str1.charAt(i);
                answer += str2.charAt(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        Solution sol = new Solution();

        System.out.println(sol.solution(str1, str2));
    }
}
