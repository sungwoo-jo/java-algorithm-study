package main.java.programmers.level0;

public class P181941_문자리스트를문자열로변환하기 {
    static class Solution {
        public String solution(String[] arr) {
            String answer = "";
            for(int i=0; i<arr.length; i++) {
                answer += arr[i];
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] testArr = {"a","b","c"};
        System.out.println(sol.solution(testArr));
    }
}