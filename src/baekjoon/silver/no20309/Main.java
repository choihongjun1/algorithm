package baekjoon.silver.no20309;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean b = true;
        for(int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(i % 2 != 0 && num % 2 == 0) {
                b = false;
            } else if(i % 2 == 0 && num % 2 != 0) {
                b = false;
            }
        }

        if(b) bw.write("YES");
        else bw.write("NO");

        br.close();
        bw.flush();
        bw.close();
    }
}
