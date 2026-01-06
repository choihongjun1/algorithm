package baekjoon.gold.no13140;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited = new boolean[10];
    static int[] result = new int[7];
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        if(n < 38210 || n > 184010) {
            bw.write("No Answer\n");

            br.close();
            bw.flush();
            bw.close();
            return;
        }

        bt(0);

        bw.write("No Answer\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bt(int count) throws IOException {
        if(count == 7) {
            int hello = 10000 * result[0] + 1000 * result[3] + 110 * result[4] + result[2];
            int world = 10000 * result[1] + 1000 * result[2] + 100 * result[5] + 10 * result[4] + result[6];
            if(hello + world == n) {
                bw.write("  " + hello + "\n");
                bw.write("+ " + world + "\n");
                bw.write("-------\n");
                if(n >= 100000) bw.write(" " + n + "\n");
                else bw.write("  " + n + "\n");

                br.close();
                bw.flush();
                bw.close();
                System.exit(0);
            }
            return;
        }

        int start = 0;
        if(count <= 1) start = 1;

        for(int i = start; i < 10; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            result[count] = i;
            bt(count + 1);
            visited[i] = false;
        }
    }
}
