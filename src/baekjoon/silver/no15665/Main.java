package baekjoon.silver.no15665;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] input, result;
    static int n, m;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        input = new int[n];
        result = new int[m];
        for(int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        bt(0);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bt(int count) throws IOException {
        if(count == m) {
            for(int i = 0; i < result.length-1; i++) {
                bw.write(result[i] + " ");
            }
            bw.write(result[result.length-1] + "\n");
            return;
        }

        int prev = -1;
        for(int i = 0; i < n; i++) {
            if(prev == input[i]) continue;
            prev = input[i];
            result[count] = input[i];
            bt(count + 1);
        }
    }
}
