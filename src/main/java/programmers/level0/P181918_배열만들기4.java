package main.java.programmers.level0;

import java.util.ArrayList;

public class P181918_배열만들기4 {
    // 프로그래머스 제출용
    static class Solution {
        public ArrayList<Integer> solution(int[] arr) {
            ArrayList<Integer> stk = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                System.out.println("현재 stk: " + stk);
                if(stk.isEmpty()) {
                    System.out.println("stk가 비어있어 값을 추가합니다.");
                    stk.add(arr[i]);
                } else {
                    if(stk.get(stk.size()-1) < arr[i]) {
                        System.out.println("stk의 마지막 원소 " + stk.get(stk.size()-1) + " 가 arr[" + i + "]의 " + arr[i] + " 보다 작아 stk의 뒤에 " + arr[i] + " 를 추가합니다.");
                        stk.add(arr[i]);
                    } else {
                        System.out.println("stk의 마지막 원소 " + stk.get(stk.size()-1) + " 가 arr[" + i + "]의 " + arr[i] + " 보다 크거나 같아 stk의 마지막 원소 (" + stk.get(stk.size()-1) + ") 를 stk 에서 제거합니다.");
                        stk.remove(stk.size()-1);
                        i--;
                    }
                }
            }
            return stk;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {1,4,2,5,3};

        System.out.println(sol.solution(arr));
    }
}

