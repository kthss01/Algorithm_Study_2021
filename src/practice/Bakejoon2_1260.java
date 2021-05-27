package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bakejoon2_1260 {
    /*
        DFS와 BFS 복습 2
        다시 풀기
     */

    public static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    public static boolean c[];

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

        dfs(V);
        System.out.println();
        Arrays.fill(c, false);
        bfs(V);
    }

    private static void dfs(int x) {

        Stack<Integer> st = new Stack<>();

        st.push(x);
        System.out.print(x + " ");
        c[x] = true;

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

            if (!flag) {
                st.pop();
            }
        }

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
}
