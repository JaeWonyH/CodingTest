import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //psvm(intellij 단축키 - main 실행함수 생성)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i= 0;i<n;i++){
            String strings = br.readLine();
            //알파벳 갯수
            int[] result = new int[26];

            for (int x = 0; x < strings.length(); x++) {
                if (strings.charAt(x) >= 'a' && strings.charAt(x) <= 'z') {
                    result[strings.charAt(x) - 'a']++; // 알파벳 크기에 저장 ex) b - a = 1
                }
            }

            int max = 0; // 일단 제일 많이 나온게 몇번?
            for (int r : result) {
                if (r > max) {
                    max = r;
                }
            }

            int cnt = 0;
            int answer = 0;

            for (int k = 0; k < 26; k++) {
                if (result[k] == max) {
                    cnt++; // 중복 체크 동일한게 2개면 ? 나오게
                    answer = k;
                }
            }
            System.out.println(cnt == 1 ? (char) (answer + 'a') : "?");
        }
    }
}