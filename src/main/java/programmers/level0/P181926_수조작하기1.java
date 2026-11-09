package main.java.programmers.level0;

public class P181926_수조작하기1 {
    // 프로그래머스 제출용
    static class Solution {
        public int solution(int n, String control) {
            for(int i=0; i<control.length(); i++) {
                switch (control.charAt(i)) {
                    case 'w':
                        n +=1;
                        break;
                    case 's':
                        n -=1;
                        break;
                    case 'd':
                        n +=10;
                        break;
                    case 'a':
                        n -=10;
                        break;
                }
            }

            return n;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int n = 0;
        String control = "wsdawsdassw";

        System.out.println(sol.solution(n, control));
    }
}

