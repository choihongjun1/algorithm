package baekjoon.bronze.no4796;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Integer> result = new ArrayList<>();

        String[] line = br.readLine().split(" ");
        int L = Integer.parseInt(line[0]);
        int P = Integer.parseInt(line[1]);
        int V = Integer.parseInt(line[2]);
        while(L != 0 || P != 0 || V != 0) {
            result.add(L * (V / P) + Math.min(V % P, L));

            line = br.readLine().split(" ");
            L = Integer.parseInt(line[0]);
            P = Integer.parseInt(line[1]);
            V = Integer.parseInt(line[2]);
        }

        for(int i = 0; i < result.size(); i++) {
            bw.write("Case " + (i+1) + ": " + result.get(i) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
