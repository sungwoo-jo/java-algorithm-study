package main.java.programmers.level0;

public class P181832_정수를나선형으로배치하기 {
    // 프로그래머스 제출용
    static class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];
            int count = 1; // 인덱스에 들어갈 숫자 (1부터 시작이므로)
            // n이 4일때 최초 0~3까지 순회해야하는 것을 기준으로
            int rowStart = 0; // 행 시작 인덱스
            int rowEnd = n-1; // 행 끝 인덱스
            int colStart = 0; // 열 시작 인덱스
            int colEnd = n-1; // 열 끝 인덱스

            while (count <= (n*n)) { // n*n번만 실행
                for (int i=colStart; i<=colEnd; i++) { // 오른쪽으로 이동
                    answer[rowStart][i] = count;
                    count += 1;
                }
                rowStart += 1;

                for (int i=rowStart; i<=rowEnd; i++) { // 아래로 이동
                    answer[i][colEnd] = count;
                    count += 1;
                }
                colEnd -= 1;

                for (int i=colEnd; i>=colStart; i--) { // 왼쪽으로 이동
                    answer[rowEnd][i] = count;
                    count += 1;
                }
                rowEnd -= 1;

                for (int i=rowEnd; i>=rowStart; i--) { // 위로 이동
                    answer[i][colStart] = count;
                    count += 1;
                }
                colStart += 1;
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int n = 5;

        System.out.println(sol.solution(n));
    }
}

