package baekjoon.gold.no1068;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Node{
        int value;
        Node parent;
        List<Node> children;

        public Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Node[] tree;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        tree = new Node[n];
        for(int i = 0; i < n; i++) {
            tree[i] = new Node(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if(parent != -1) {
                tree[i].parent = tree[parent];
                tree[parent].children.add(tree[i]);
            }
        }

        int del = Integer.parseInt(br.readLine());
        deleteNode(del);

        int leaf = 0;
        for(Node node : tree) {
            if(node != null && node.children.isEmpty()) leaf++;
        }
        bw.write(leaf + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void deleteNode(int del) {
        List<Node> children = new ArrayList<>(tree[del].children);
        for(Node node : children) {
            deleteNode(node.value);
            tree[node.value] = null;
        }
        if(tree[del].parent != null) tree[del].parent.children.remove(tree[del]);
        tree[del] = null;
    }
}
