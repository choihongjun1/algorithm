package baekjoon.silver.no15655;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static boolean[] visited;
    static int[] input, result;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        input = new int[n+1];
        visited = new boolean[n+1];
        result = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        recursion(0, 0);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void recursion(int count, int num) throws IOException {
        if(count == m) {
            for(int i = 0; i < result.length-1; i++) {
                bw.write(result[i] + " ");
            }
            bw.write(result[result.length-1] + "\n");
            return;
        }

        for(int i = num+1; i <= n; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            result[count] = input[i];
            recursion(count + 1, i);
            visited[i] = false;
        }
    }
}
