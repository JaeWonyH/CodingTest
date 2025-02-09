import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int[] visited;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = br.readLine().split(" ");
        int n= Integer.parseInt(strings[0]);
        int m= Integer.parseInt(strings[1]);

        graph = new ArrayList<>(n + 1);
        // 각 노드에 대한 리스트 초기화
        for (int i = 0; i <= n+1; i++) {
            graph.add(new ArrayList<>());
        }
        //그래프 초기화
        for(int i = 0;i<m;i++){
            String[] nodes = br.readLine().split(" ");
            int u = Integer.parseInt(nodes[0]);
            int v = Integer.parseInt(nodes[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        //방문 여부 초기화
        visited = new int[n+1];
        visited[0] = 1;
        int result = 0;
        for(int i = 1;i<n+1;i++){
            if(visited[i] == 0){
                dfs(i);
                result ++;
            }
        }
        System.out.println(result);
    }

    static void dfs(int nodeIndex) {
        // 방문 처리
        visited[nodeIndex] = 1;

        // 방문 노드 출력
        //System.out.print(nodeIndex + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph.get(nodeIndex)) {
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(visited[node] == 0) {
                dfs(node);
            }
        }
    }
}