package main.java.programmers.level0;

public class P181881_조건에맞게수열반환하기 {
    // 프로그래머스 제출용
    static class Solution {
        public int solution(int[] arr) {
            int targetRepeat = 0;
            for(int i=0; i<arr.length; i++) { // 전체 반복 횟수
                boolean changeFlag = false;
                for(int j=0; j<arr.length; j++) {
                    if (arr[j] >= 50 && arr[j] % 2 == 0) {
                        arr[j] = arr[j] / 2;
                        changeFlag = true;
                    } else if (arr[j] < 50 && arr[j] % 2 == 1) {
                        arr[j] = arr[j] * 2 + 1;
                        changeFlag = true;
                    }
                }
                if (!changeFlag) {
                    targetRepeat = i;
                    break;
                }
            }
            return targetRepeat;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(sol.solution(arr));
    }
}

