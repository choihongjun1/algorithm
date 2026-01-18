package baekjoon.silver.no15664;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;
    static int[] input, result;
    static int n, m;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        input = new int[n];
        visited = new boolean[n];
        result = new int[m];
        for(int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        bt(0, -1);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bt(int count, int num) throws IOException {
        if(count == m) {
            for(int i = 0; i < result.length-1; i++) {
                bw.write(result[i] + " ");
            }
            bw.write(result[result.length-1] + "\n");
            return;
        }

        int prev = -1;
        for(int i = num+1; i < n; i++) {
            if(visited[i]) continue;
            if(prev == input[i]) continue;
            visited[i] = true;
            prev = input[i];
            result[count] = input[i];
            bt(count + 1, i);
            visited[i] = false;
        }
    }
}
