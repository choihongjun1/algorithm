package baekjoon.silver.no1991;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        char value;
        Node left;
        Node right;
        public Node(char value) {
            this.value = value;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static Node[] tree = new Node[26];

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char v = st.nextToken().charAt(0);
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);

            if(tree[v - 'A'] == null) tree[v - 'A'] = new Node(v);
            if(l != '.') {
                if(tree[l - 'A'] == null) tree[l - 'A'] = new Node(l);
                tree[v - 'A'].left = tree[l - 'A'];
            }
            if(r != '.') {
                if(tree[r - 'A'] == null) tree[r - 'A'] = new Node(r);
                tree[v - 'A'].right = tree[r - 'A'];
            }
        }

        preorderTraversal(tree[0]);
        sb.append("\n");
        inorderTraversal(tree[0]);
        sb.append("\n");
        postorderTraversal(tree[0]);

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void preorderTraversal(Node root) {
        if(root == null) return;
        sb.append(root.value);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(Node root) {
        if(root == null) return;
        inorderTraversal(root.left);
        sb.append(root.value);
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root) {
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        sb.append(root.value);
    }
}
