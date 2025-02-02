import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int solution;
        for(int i =0;i<n;i++){
            String[] command = br.readLine().split(" ");
            solution = -2;
            if(command[0].equals("push")){
                push(Integer.parseInt(command[1]));
            } else if (command[0].equals("pop")) {
                solution = pop();
            } else if (command[0].equals("size")) {
                solution = size();
            } else if (command[0].equals("empty")) {
                solution = empty();
            } else if (command[0].equals("top")) {
                solution = top();
            }
            if(solution != -2){
                System.out.println(solution);
            }

        }

    }
    private static void push(int x){
        stack.push(x);
    }
    private static int pop(){
        if(stack.empty()){
            return  -1;
        }else{
            int x = stack.pop();
            return x;
        }
    }
    private static int size(){
        return stack.size();
    }
    private static int empty(){
        if(stack.empty()){
            return 1;
        }else{
            return 0;
        }
    }
    private static int top(){
        if(stack.empty()){
            return -1;
        }
        else{
            return stack.peek();
        }
    }
}