package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        //포케몬 수
        int n = Integer.parseInt(str[0]);
        //문제 수
        int m = Integer.parseInt(str[1]);
        //포켓몬 번호
        int count = 0;
        //포켓몬 도감 자료구조 -> hashmap
        HashMap<Integer,String> poketmonsByNumber = new HashMap<Integer,String>();
        HashMap<String,Integer> poketmonsByName = new HashMap<String,Integer>();

        //포켓몬 도감 초기화
        for(int i=0;i<n;i++ ){
            String poketmon = br.readLine();
            count++;
            poketmonsByNumber.put(count, poketmon);
            poketmonsByName.put(poketmon,count);
        }

        //문제풀이
        for(int i =0;i<m;i++){
            String problem = br.readLine();
            String answer = "";
            char tmp;
            boolean isNum = true;

            //입력받은게 숫자인지 문자열인지 판단
            for(int x =0;x<problem.length();x++){
                tmp = problem.charAt(x);
                //숫자가 아닌경우
                if(Character.isDigit(tmp)==false){
                    isNum = false;
                }
            }
            //숫자인경우 문제풀이
            if(isNum){
                answer = poketmonsByNumber.get(Integer.parseInt(problem));
            }
            //숫자가 아닌 경우 문제풀이
            else{
                answer = String.valueOf(poketmonsByName.get(problem));
            }
            System.out.println(answer);
        }


    }
}
