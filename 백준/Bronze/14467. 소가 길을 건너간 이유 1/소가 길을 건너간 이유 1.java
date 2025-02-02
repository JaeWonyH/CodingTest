import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //관찰 횟수
        int n = Integer.parseInt(br.readLine());
        //소번호와 위치를 담은 이차 배열 선언, 소가 한번도 움직이지 않았으면 -1
        int[][] arr = new int[11][1];
        for(int i=1;i<11;i++)
        {
            arr[i][0] = -1;
        }

        //소가 움직인 최소 횟수
        int count = 0;
        for(int i=0;i<n;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cowId = Integer.parseInt(st.nextToken());
            int position = Integer.parseInt(st.nextToken());
            //최초에 움직인 경우는 제외
            if(arr[cowId][0]==-1)
            {
                arr[cowId][0] = position;
            }
            else if(arr[cowId][0] != position){
                count++;
                arr[cowId][0] = position;
            }
        }
        System.out.println(count);
    }
}