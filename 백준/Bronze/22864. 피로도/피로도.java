import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        //하루는 24시간
        //한시간에 쌓이는 피로도(+)
        int a = Integer.parseInt(strings[0]);
        //한시간에 처리할수 있는 일의 양(+)
        int b = Integer.parseInt(strings[1]);
        //한시간 쉬면 깍이는 피로도(-)
        int c = Integer.parseInt(strings[2]);
        //max 피로도
        int m = Integer.parseInt(strings[3]);

        //하루 최대 일의 양 max피로도 안넘으면서, 맨처음 피로도 0
        int hp = 0;
        int result = 0;
        for(int i =0;i<24;i++){
            if(hp >= m){
                hp = hp - c;
                if(hp < 0){
                    hp = 0;
                }
            }else{
                hp = hp +a;
                if(hp <= m){
                    result = result + b;
                }else{
                    hp = hp - a;
                    hp = hp - c;
                    if(hp < 0){
                        hp =0;
                    }
                }
            }
        }
        System.out.println(result);


    }

}