import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    static Integer[] lightStatus;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
//        String s = "abcdefg";   //출력할 문자열
//        bw.write(s+"\n");   //버퍼에 있는 값 전부 출력
//        bw.flush();   //남아있는 데이터를 모두 출력시킴
//        bw.close();
        String[] strings = br.readLine().split(" ");
        //전구 갯수
        int n = Integer.parseInt(strings[0]);
        //명령어 갯수
        int m = Integer.parseInt(strings[1]);
        //전구 상태
        lightStatus = new Integer[n];

        //초기 전구상태 초기화
        String[] fristLightStatus = br.readLine().split(" ");
        for(int i =0;i<n;i++){
            lightStatus[i] = Integer.parseInt(fristLightStatus[i]);
        }
        //명령어 수행
        for(int i =0;i<m;i++){
            String[] actions = br.readLine().split(" ");
            if(actions[0].equals("1")){
                action1(Integer.parseInt(actions[1]), Integer.parseInt(actions[2]));
            } else if (actions[0].equals("2")) {
                action2(Integer.parseInt(actions[1]), Integer.parseInt(actions[2]));
            }else if (actions[0].equals("3")) {
                action3(Integer.parseInt(actions[1]), Integer.parseInt(actions[2]));
            }else if (actions[0].equals("4")) {
                action4(Integer.parseInt(actions[1]), Integer.parseInt(actions[2]));
            }

        }
        for (Integer status : lightStatus) {
            bw.write(status + " ");
        }
        bw.flush();
        bw.close();

    }
    private static void action1(int x, int y){
        lightStatus[x-1] = y;
    }
    private static void action2(int x, int y){
        for(int i = x-1;i<=y-1;i++){
            if(lightStatus[i] == 0){
                lightStatus[i] = 1;
            }else {
                lightStatus[i] = 0;
            }
        }
    }
    private static void action3(int x, int y){
        for(int i = x-1;i<=y-1;i++){
            lightStatus[i] = 0;
        }
    }
    private static void action4(int x, int y){
        for(int i = x-1;i<=y-1;i++){
            lightStatus[i] = 1;
        }
    }
}