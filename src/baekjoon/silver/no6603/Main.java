package baekjoon.silver.no6603;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;
    static int[] input;
    static int[] result = new int[6];
    static int n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n == 0) break;
            input = new int[n];
            visited = new boolean[n];
            for(int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(st.nextToken());
            }
            bt(0, 0);
            sb.append("\n");
        }

        bw.write(sb.toString().trim());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bt(int count, int num) throws IOException {
        if(count == 6) {
            for(int i = 0; i < result.length-1; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append(result[result.length-1]).append("\n");
            return;
        }

        for(int i = num; i < n; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            result[count] = input[i];
            bt(count+1, i+1);
            visited[i] = false;
        }
    }
}
