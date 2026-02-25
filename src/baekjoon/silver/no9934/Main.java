package baekjoon.silver.no9934;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] tree, input;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(br.readLine());
        tree = new int[(int)Math.pow(2,k)];
        input = new int[(int)Math.pow(2,k)];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < input.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        inorderTraversal(1);

        StringBuilder sb = new StringBuilder();
        int level = 1;
        for(int i = 1; i < tree.length; i++) {
            sb.append(tree[i]);
            if(i == Math.pow(2, level) - 1) {
                sb.append('\n');
                level++;
            }
            else sb.append(' ');
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void inorderTraversal(int index) {
        if(index == -1) return;
        inorderTraversal(leftChild(index));
        tree[index] = input[++count];
        inorderTraversal(rightChild(index));
    }

    public static int leftChild(int index) {
        return 2 * index < tree.length ? 2 * index : -1;
    }

    public static int rightChild(int index) {
        return 2 * index + 1 < tree.length ? 2 * index + 1 : -1;
    }
}
