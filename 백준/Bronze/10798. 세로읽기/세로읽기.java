import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //가로15, 세로5 2차원 배열 선언
        String[][] stirngArray = new String[5][15];

        for(int i =0;i<5;i++){
            String[] word = br.readLine().split("");
            for(int x=0;x<word.length;x++){
                stirngArray[i][x] = word[x];
            }
        }
        List<String> words = new ArrayList<>();
        for(int i = 0;i<15;i++){
            for(int x = 0;x<5;x++){
                if(stirngArray[x][i] != null){
                    words.add(stirngArray[x][i]);
                }
            }
        }
        String answer = String.join("",words);
        System.out.println(answer);
    }
}