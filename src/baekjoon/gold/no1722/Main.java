package baekjoon.gold.no1722;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long[] factorial = new long[21];
    public static void main(String[] args) throws IOException {
        factorial[0] = 1;
        for(int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i-1] * i;
        }

        int n = Integer.parseInt(br.readLine());
        List<Long> list = new LinkedList<>();
        for(long i = 1; i <= n; i++) {
            list.add(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        if(x == 1) {
            long k = Long.parseLong(st.nextToken());
            StringBuilder sb = new StringBuilder();

            for(int i = n-1; i >= 0; i--) {
                long num = (k-1) / factorial[i];
                sb.append(list.get((int)num)).append(" ");
                k -= num * factorial[i];
                list.remove((int)num);
            }

            bw.write(sb.toString().trim());
        } else if(x == 2) {
            long k = 1;
            for(int i = n-1; i >= 0; i--) {
                long num = Long.parseLong(st.nextToken());
                int index = list.indexOf(num);
                k += index * factorial[i];
                list.remove(index);
            }

            bw.write(k + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
