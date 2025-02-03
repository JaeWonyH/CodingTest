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
        Queue<String> word1 = new LinkedList<>();
        Queue<String> word2 = new LinkedList<>();
        Queue<String> word3 = new LinkedList<>();
        Queue<String> word4 = new LinkedList<>();
        Queue<String> word5 = new LinkedList<>();
        for(int i =1;i<6;i++){
            String[] words = br.readLine().split("");
            for(int x=0;x< words.length;x++){
                if(i==1){
                    word1.add(words[x]);
                } else if (i==2) {
                    word2.add(words[x]);
                } else if (i==3) {
                    word3.add(words[x]);
                } else if (i==4) {
                    word4.add(words[x]);
                } else if (i==5) {
                    word5.add(words[x]);
                }
            }
        }
        List<String> solution = new ArrayList<>();
        String peekWord1 = "";
        String peekWord2 = "";
        String peekWord3 = "";
        String peekWord4 = "";
        String peekWord5 = "";
        for(int cnt =0;cnt<15;cnt++){
            peekWord1 = pop(word1);
            peekWord2 = pop(word2);
            peekWord3 = pop(word3);
            peekWord4 = pop(word4);
            peekWord5 = pop(word5);
            if(!peekWord1.equals("-1")){
                solution.add(peekWord1);
            }
            if(!peekWord2.equals("-1")){
                solution.add(peekWord2);
            }
            if(!peekWord3.equals("-1")){
                solution.add(peekWord3);
            }
            if(!peekWord4.equals("-1")){
                solution.add(peekWord4);
            }
            if(!peekWord5.equals("-1")){
                solution.add(peekWord5);
            }
        }
        String answer = String.join("",solution);
        System.out.println(answer);
    }
    private static String pop(Queue<String> word){
        String result;
        if(word.isEmpty()){
            return String.valueOf(-1);
        }else{
            result = word.peek();
            word.remove();
            return result;
        }
    }
}