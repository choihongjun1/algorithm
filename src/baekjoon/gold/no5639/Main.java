package baekjoon.gold.no5639;

import java.io.*;

public class Main {
    static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        int value = Integer.parseInt(line);
        Node root = new Node(value);
        while((line = br.readLine()) != null) {
            value = Integer.parseInt(line);
            Node node = new Node(value);
            insert(root, node);
        }

        postorderTraversal(root);
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static Node insert(Node root, Node node) {
        if(root == null) {
            root = node;
            return root;
        }

        if(node.value < root.value) {
            root.left = insert(root.left, node);
        }
        else if(node.value > root.value) {
            root.right = insert(root.right, node);
        }
        return root;
    }

    public static void postorderTraversal(Node root) {
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        sb.append(root.value).append("\n");
    }
}
