package baekjoon.gold.no15681;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int value;
        Node parent;
        List<Node> children;

        public Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
    static Node[] tree;
    static List<Integer>[] adj;
    static int[] size;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int root = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        tree = new Node[n+1];
        for(int i = 1; i <= n; i++) tree[i] = new Node(i);
        adj = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        size = new int[n+1];

        for(int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        makeTree(root, -1);
        countNode(root);

        for(int i = 0; i < q; i++) {
            int node = Integer.parseInt(br.readLine());
            bw.write(size[node] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void makeTree(int curr, int parent) {
        for(int i : adj[curr]) {
            if(i != parent) {
                 tree[curr].children.add(tree[i]);
                 tree[i].parent = tree[curr];
                 makeTree(i, curr);
            }
        }
    }

    public static void countNode(int root) {
        size[root] = 1;
        for(Node node : tree[root].children) {
            countNode(node.value);
            size[root] += size[node.value];
        }
    }
}
