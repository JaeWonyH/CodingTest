package 자료구조;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main_10845 {
    //큐 자료형 선언
    static Deque<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //명령 실행 횟수
        int n = Integer.parseInt(br.readLine());
        //출력할 정수
        int solution = -2;

        for(int i=0;i<n;i++)
        {
            String[] command = br.readLine().split(" ");

            if(command[0].equals("push"))
            {
                push(Integer.parseInt(command[1]));
                solution = -2;
            }
            else if(command[0].equals("pop"))
            {
                solution = pop();
            }
            else if(command[0].equals("size"))
            {
                solution = size();
            }
            else if(command[0].equals("empty"))
            {
                solution = empty();
            }
            else if(command[0].equals("front"))
            {
                solution = front();
            }
            else if(command[0].equals("back"))
            {
                solution = back();
            }

            if(solution != -2){
                System.out.println(solution);
            }

        }
    }

    private static void push(int x)
    {
        queue.offer(x);
    }
    private static int pop()
    {
        if(queue.peek() == null)
        {
            return -1;
        }
        else
        {
            int x = queue.peek();
            queue.remove(x);
            return x;
        }
    }
    private static int size()
    {
        return queue.size();
    }
    private static int empty()
    {
        if(queue.isEmpty())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    private static int front()
    {
        if(queue.peek() == null)
        {
            return -1;
        }
        else
        {
            return queue.peek();
        }
    }
    private static int back()
    {
        if(queue.peekLast() == null)
        {
            return -1;
        }
        else
        {
            return queue.peekLast();
        }
    }

}
