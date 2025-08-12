package baekjoon.silver.no1758;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list, Collections.reverseOrder());

        long sum = 0;
        for(int i = 0; i < n; i++) {
            int tip = list.get(i) - i;
            if(tip <= 0) break;
            sum += tip;
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
