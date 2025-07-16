import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int prev = -1; // arr의 원소는 0~9이므로 -1은 초기값으로 안전함

        for (int num : arr) {
            if (num != prev) {
                result.add(num);
                prev = num;
            }
        }

        // List -> int[] 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}