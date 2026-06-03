package main.java.programmers.level0;

public class P181939_더크게합치기 {
    // 프로그래머스 제출용
    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;

            // a 를 문자열 변환(Integer.toString 를 활용해 숫자를 문자로 변환)
            String strA = Integer.toString(a);
            // b 를 문자열 변환
            String strB = Integer.toString(b);
            // a + b 를 더한 결과(Integer.parseInt 를 활용해 문자열을 숫자로 변환)
            int sumAB = Integer.parseInt(strA+strB);
            // b + a 를 더한 결과
            int sumBA = Integer.parseInt(strB+strA);

            if(sumAB > sumBA || sumAB == sumBA) {
                answer = sumAB;
            } else {
                answer = sumBA;
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int a = 89;
        int b = 8;

        System.out.println(sol.solution(a, b));
    }
}
