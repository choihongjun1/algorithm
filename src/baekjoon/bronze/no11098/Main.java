package baekjoon.bronze.no11098;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] result = new String[t];

        for(int i = 0; i < t; i++) {
            int max = 0;
            String name = "";
            int p = Integer.parseInt(br.readLine());
            for(int j = 0; j < p; j++) {
                String[] player = br.readLine().split(" ");
                int cost = Integer.parseInt(player[0]);
                if(max < cost) {
                    max = cost;
                    name = player[1];
                }
            }
            result[i] = name;
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
