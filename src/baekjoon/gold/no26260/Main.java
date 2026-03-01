package baekjoon.gold.no26260;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] tree;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        tree = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int del = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == -1) del = i;
        }
        arr[del] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        tree[1] = makeBST(arr, left, right, 1);

        postorderTraversal(1);
        bw.write(sb.toString().trim());

        br.close();
        bw.flush();
        bw.close();
    }

    public static int makeBST(int[] arr, int left, int right, int index) {
        if(left == right) return arr[left];
        int mid = (left + right) / 2;
        tree[2*index] = makeBST(arr, left, mid - 1, 2*index);
        tree[2*index+1] = makeBST(arr, mid + 1, right, 2*index+1);
        return arr[mid];
    }

    public static void postorderTraversal(int index) {
        if(index >= tree.length) return;
        postorderTraversal(2*index);
        postorderTraversal(2*index+1);
        sb.append(tree[index]).append(" ");
    }
}
