import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //자연수 범위(m이상, n 이하)
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        //소수 List
        ArrayList<Integer> primeNums = new ArrayList<Integer>();
        for(int i = m;i<=n;i++){
            if(isPrimeNumber(i)){
                primeNums.add(i);
            }
        }
        if(primeNums.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(addAll(primeNums));
            System.out.println(primeNums.get(0));
        }


    }
    private static boolean isPrimeNumber(int x){
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {			// n의 제곱근까지 나누기
            if (x % i == 0) return false;
        }
        return true;
    }
    private static int addAll(ArrayList<Integer> nums){
        int result= 0;
        for(int i =0;i<nums.size();i++){
            result = result +nums.get(i);
        }
        return result;

    }

}