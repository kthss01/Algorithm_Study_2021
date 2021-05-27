package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1991 {
    /*
        트리 순회

        이진 트리를 입력 받아 전위 순회, 중위 순회, 후위 순회 결과 출력

        N (1 <= N <= 26) 노드의 개수
        N개줄 각 노드와 그의 자식 노드 공백 구문 입력
        A 항상 루트 노드, 자식 노드 없으면 .
        전위,중위,후위 순 결과 출력
     */

    static int[][] a = new int[50][2];

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());

        for (int i = 1; i <= n; i++) {
            token = new StringTokenizer(br.readLine());

            int x = token.nextToken().charAt(0) - 'A';
            char y = token.nextToken().charAt(0);
            char z = token.nextToken().charAt(0);

            a[x][0] = y == '.' ? -1 : y - 'A';
            a[x][1] = z == '.' ? -1 : z - 'A';
        }

        preorder(0);
        System.out.println();
        inorder(0);
        System.out.println();
        postorder(0);
        System.out.println();
    }

    private static void postorder(int x) {
        if (x == -1) return;
        postorder(a[x][0]); // left
        postorder(a[x][1]); // right
        System.out.print((char)(x + 'A'));
    }

    private static void preorder(int x) {
        if (x == -1) return;
        System.out.print((char)(x + 'A'));
        preorder(a[x][0]); // left
        preorder(a[x][1]); // right
    }

    private static void inorder(int x) {
        if (x == -1) return;
        inorder(a[x][0]); // left
        System.out.print((char)(x + 'A'));
        inorder(a[x][1]); // right
    }
}
