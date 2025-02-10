import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //자연수 갯수
        int n = Integer.parseInt(br.readLine());
        //자연수
        String[] strings = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = Integer.parseInt(strings[i]);
        }
        //소수 비교
        int result = 0;
        for(int num : nums){
            if(isPrimeNumber(num)){
                result++;
            }
        }
        System.out.println(result);
    }
    private static boolean isPrimeNumber(int x){
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {			// n의 제곱근까지 나누기
            if (x % i == 0) return false;
        }
        return true;
    }

}