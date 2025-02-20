import java.util.ArrayList;
import java.util.List;

public class DFS_Recursion {
    // 방문처리에 사용 할 배열선언
    static boolean[] vistied = new boolean[9];

    // 그림예시 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각하시면됩니다.
    //static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(9);
    static {
        // 2차원 리스트 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 연결
        graph.get(1).addAll(List.of(2, 3, 8));
        graph.get(2).addAll(List.of(1, 6, 8));
        graph.get(3).addAll(List.of(1, 5));
        graph.get(4).addAll(List.of(5, 7));
        graph.get(5).addAll(List.of(3, 4, 7));
        graph.get(6).addAll(List.of(2));
        graph.get(7).addAll(List.of(4, 5));
        graph.get(8).addAll(List.of(1, 2));
    }

    public static void main(String[] args) {
        dfs(1);
    }

    static void dfs(int nodeIndex) {
        // 방문 처리
        vistied[nodeIndex] = true;

        // 방문 노드 출력
        System.out.print(nodeIndex + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph.get(nodeIndex)) {
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!vistied[node]) {
                dfs(node);
            }
        }
    }
}
