package baekjoon.gold.no28706;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            boolean[] result = new boolean[7];
            boolean[] prev = new boolean[7];
            prev[1] = true;

            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String op1 = st.nextToken();
                int v1 = Integer.parseInt(st.nextToken());
                String op2 = st.nextToken();
                int v2 = Integer.parseInt(st.nextToken());

                for(int k = 0; k < prev.length; k++) {
                    if(prev[k]) {
                        if(op1.equals("+")) result[(k + v1) % 7] = true;
                        else result[(k * v1) % 7] = true;
                        if(op2.equals("+")) result[(k + v2) % 7] = true;
                        else result[(k * v2) % 7] = true;
                    }
                }

                for(int k = 0; k < result.length; k++) {
                    prev[k] = result[k];
                    result[k] = false;
                }
            }

            if(prev[0]) bw.write("LUCKY\n");
            else bw.write("UNLUCKY\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
