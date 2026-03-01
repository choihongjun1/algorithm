package baekjoon.silver.no13237;

import java.io.*;

public class Main {
    static class Node {
        Node parent;
        Node left;
        Node right;
        int height;
    }

    static Node[] tree;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        tree = new Node[n+1];
        for(int i = 1; i < tree.length; i++) tree[i] = new Node();

        int root = 0;
        for(int i = 1; i < tree.length; i++) {
            int parent = Integer.parseInt(br.readLine());
            if(parent != -1) {
                tree[i].parent = tree[parent];
                if(tree[parent].left == null) tree[parent].left = tree[i];
                else tree[parent].right = tree[i];
            }
            else root = i;
        }

        setHeight(tree[root], 0);

        for(int i = 1; i < tree.length; i++) {
            bw.write(tree[i].height + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void setHeight(Node root, int height) {
        if(root == null) return;

        root.height = height;
        setHeight(root.left, height+1);
        setHeight(root.right, height+1);
    }
}
