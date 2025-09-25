package baekjoon.silver.no11047;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int money = Integer.parseInt(line[1]);
        List<Integer> coin = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int c = Integer.parseInt(br.readLine());
            if(c <= money) coin.add(c);
        }

        int k = 0;
        for(int i = coin.size() - 1; i >= 0; i--) {
            k += money / coin.get(i);
            money %= coin.get(i);
            if(money == 0) break;
        }

        bw.write(k + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
