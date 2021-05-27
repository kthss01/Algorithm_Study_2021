package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Baekjoon_1260 {
    /*
        DFS와 BFS

        DFS결과 BFS 결과 출력
        방문할 수 있는 점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
        정점 번호는 1 ~ N번

        N (1 <= N <= 1,000) 정점의 개수 N
        M (1 <= M <= 10,000) 간선의 개수 M
        V 탐색을 시작할 정점의 번호 V
     */

    public static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    public static boolean[] c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());

        for (int i = 0; i <= N; i++) {
            a.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            token = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(token.nextToken());
            int v = Integer.parseInt(token.nextToken());

            a.get(u).add(v);
            a.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(a.get(i));
        }

        c = new boolean[N + 1];

//        dfs(V);
        dfs2(V);
        System.out.println();
        Arrays.fill(c, false);
        bfs(V);
    }

    private static void bfs(int x) {

        Queue<Integer> q = new LinkedList<>();

        c[x] = true;
        q.add(x);

        while (!q.isEmpty()) {
            x = q.poll();
            System.out.print(x + " ");

            for (int y : a.get(x)) {
                if (!c[y]) {
                    c[y] = true;
                    q.add(y);
                }
            }

        }
    }

    private static void dfs(int x) {
        c[x] = true;
        System.out.print(x + " ");

        for (int y : a.get(x)) {
            if (!c[y]) {
                dfs(y);
            }
        }
    }

    private static void dfs2(int x) {
        Stack<Integer> st = new Stack<>();

        st.push(x);
        c[x] = true;
        System.out.print(x + " ");

        while (!st.isEmpty()) {
            boolean flag = false;
            x = st.peek();

            for (int y : a.get(x)) {
                if (!c[y]) {
                    st.push(y);
                    System.out.print(y + " ");

                    c[y] = true;
                    flag = true;
                    break;
                }
            }

            if (!flag)
                st.pop();
        }
    }
}
