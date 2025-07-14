class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
            int[] students = new int[n];

            // 체육복 잃어버린 학생 -1
            for (int i = 0; i < lost.length; i++) {
                students[lost[i] - 1] -= 1;
            }

            // 여벌 체육복 있는 학생 +1
            for (int i = 0; i < reserve.length; i++) {
                students[reserve[i] - 1] += 1;
            }
            // 체육복 빌려주기
            for (int i = 0; i < n; i++) {
                if (students[i] == -1) {
                    // 앞사람이 여분이 있는 경우
                    if (i > 0 && students[i - 1] == 1) {
                        students[i]++;
                        students[i - 1]--;
                    }
                    // 뒷사람이 여분이 있는 경우
                    else if (i < n - 1 && students[i + 1] == 1) {
                        students[i]++;
                        students[i + 1]--;
                    }
                }
            }

            // 체육복이 있는 학생 수 카운트
            for (int i = 0; i < n; i++) {
                if (students[i] >= 0) {
                    answer++;
                }
            }
            return answer;
    }
}