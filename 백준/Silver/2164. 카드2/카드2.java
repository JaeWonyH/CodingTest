import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //N장의 카드
        int n = Integer.parseInt(br.readLine());
        //디큐 활용
        Deque<Integer> cards = new LinkedList<>();
        //마지막에 남는 정수
        int lastInt = 0;
        //초기상태 초기화
        for(int i = 0;i<n;i++){
            cards.add(i+1);
        }
        //카드 섞기 시작
        if(n == 1){
            System.out.println(cards.peek());
        }else{
            for(int i=1;i<n;i++){
                lastInt = shuffleCard(cards);
            }
            System.out.println(lastInt);
        }
    }
    private static Integer shuffleCard(Deque<Integer> cardList){
        //맨 앞에꺼 버리기
        cardList.removeFirst();
        //맨 앞에꺼 젤 뒤로 이동(맨 앞에꺼 삽입하고 버리기)
        cardList.addLast(cardList.peek());
        cardList.removeFirst();

        return cardList.peekLast();
    };
}