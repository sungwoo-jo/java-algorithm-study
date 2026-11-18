package main.java.programmers.level0;

public class P181922_수열과구간쿼리4 {
    // 프로그래머스 제출용
    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            for (int[] querie : queries) {
                int s = querie[0];
                int e = querie[1];
                int k = querie[2];

                for (int i=s; i<=e; i++) {
                    if (i % k == 0) { // 배수
                        arr[i] += 1;
                    }
                }
            }

            return arr;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        System.out.println(sol.solution(arr, queries));
    }
}

