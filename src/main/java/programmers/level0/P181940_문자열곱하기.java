package main.java.programmers.level0;

public class P181940_문자열곱하기 {
    static class Solution {
        public String solution(String my_string, int k) {
            String answer = "";

            for(int i=0; i<k; i++) {
                answer += my_string;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        String my_string = "love";
        int k = 10;

        Solution sol = new Solution();

        System.out.println(sol.solution(my_string, k));
    }
}

