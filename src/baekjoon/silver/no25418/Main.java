package baekjoon.silver.no25418;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr = new int[1000001];

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bfs(a, b);
        bw.write(arr[b] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(int a, int b) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);

        while(!queue.isEmpty()) {
            int curr = queue.poll();

            if(curr+1 < arr.length && arr[curr+1] == 0) {
                queue.add(curr+1);
                arr[curr+1] = arr[curr] + 1;
            }
            if(curr*2 < arr.length && arr[curr*2] == 0) {
                queue.add(curr*2);
                arr[curr*2] = arr[curr] + 1;
            }

            if(arr[b] != 0) break;
        }
    }
}
