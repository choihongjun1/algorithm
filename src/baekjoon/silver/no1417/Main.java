package baekjoon.silver.no1417;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int vote1 = Integer.parseInt(br.readLine()); // 기호 1번
        if(n == 1) {
            bw.write("0");

            bw.flush();
            bw.close();
            br.close();
            return;
        }

        int[] vote = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            vote[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(vote);

        int count = 0;
        int max = vote[n-2];
        while(vote1 <= max) {
            vote1++;
            vote[n-2]--;
            count++;
            Arrays.sort(vote);
            max = vote[n-2];
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
