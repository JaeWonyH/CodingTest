import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);
        int d = Integer.parseInt(strings[3]);
        int e = Integer.parseInt(strings[4]);
        int f = Integer.parseInt(strings[5]);

        for(int x = -999;x<=999;x++){
            for(int y= -999;y<=999;y++){
                if(a*x+b*y == c && d*x +e*y == f){
                    System.out.println(x + " "+y);
                }
            }
        }
    }

}