import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n =2 or 3
        int n = Integer.parseInt(br.readLine());
        //n개의 수
        String[] strings = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = Integer.parseInt(strings[i]);
        }
        //공약수 구하기
        ArrayList<Integer> results = new ArrayList<Integer>();
        int gcdNum = gcd(nums);
        results = getDivisor(gcdNum);
        String result = "";
        for (int i = 0;i<results.size();i++){
            result = result + String.valueOf(results.get(i))+" ";
        }
        System.out.println(result);
    }
    //두 수 최대공약수
    private static int gcd(int a, int b) {
        if(a<=b){
            int temp = a;
            a= b;
            b= temp;
        }
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    //n개의 수의 공약수
    private static int gcd(int[] nums){
        int result = nums[0];
        for(int i =0;i<nums.length;i++){
            result = gcd(result,nums[i]);
        }
        return result;
    }
    //약수 구하기
    private static ArrayList<Integer> getDivisor(int a){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=1;i<=a;i++){
            if(a%i == 0){
                result.add(i);
            }
        }
        if(!result.isEmpty()){
            result.sort(Comparator.naturalOrder());
        }

        return  result;
    }

}