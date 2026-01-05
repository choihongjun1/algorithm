package baekjoon.gold.no1669;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y  = Integer.parseInt(st.nextToken());

        bw.write(findMin(y - x) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int findMin(int d) {
        if(d == 0) return 0;
        int count = 1;
        long sum = 1;
        int num = 1;
        while (sum < d) {
            count++;
            sum += num;
            if(count % 2 == 0) num++;
        }
        return count;
    }
}
