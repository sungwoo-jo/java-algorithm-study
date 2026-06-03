package main.java.programmers.level0;

public class P120821_배열뒤집기 {
    // 프로그래머스 제출용
    static class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];

            for(int i=0; i<num_list.length; i++) {
                answer[i] = num_list[num_list.length - i - 1];
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println(sol.solution(num_list));
    }
}

