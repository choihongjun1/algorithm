package baekjoon.silver.no2161;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        String result = "";
        while(queue.size() > 1) {
            result += queue.poll() + " ";
            queue.offer(queue.poll());
        }
        result += queue.poll();

        bw.write(result.trim());

        br.close();
        bw.flush();
        bw.close();
    }
}
