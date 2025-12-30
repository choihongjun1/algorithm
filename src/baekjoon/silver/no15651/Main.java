package baekjoon.silver.no15651;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int[] result;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new int[m];

        recursion(0);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void recursion(int count) throws IOException {
        if(count == m) {
            for(int i = 0; i < result.length-1; i++) {
                bw.write(result[i] + " ");
            }
            bw.write(result[result.length-1] + "\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            result[count] = i;
            recursion(count + 1);
        }
    }
}
