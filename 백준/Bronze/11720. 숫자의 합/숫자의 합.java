import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        //문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자열 읽기
        //합칠 문자 수
        int n = Integer.parseInt(br.readLine());
        //합치는 문자들
        String str[] = br.readLine().split("");
        //비지니스 로직(숫자의 합)
        int sum = 0;
        for(int i =0;i<n;i++)
        {
            sum += Integer.parseInt(str[i]);
        }

        //문자열 출력
        System.out.println(sum);
    }
}