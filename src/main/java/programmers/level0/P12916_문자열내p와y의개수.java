package main.java.programmers.level0;

public class P12916_문자열내p와y의개수 {
    // 프로그래머스 제출용
    static class Solution {
        public boolean solution(String s) {
            s = s.toLowerCase();
            int pCnt = 0;
            int yCnt = 0;

            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == 'p') {
                    pCnt+=1;
                } else if (s.charAt(i) == 'y') {
                    yCnt+=1;
                }
            }
            return pCnt == yCnt;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        String s = "Pyy";

        System.out.println(sol.solution(s));
    }
}

