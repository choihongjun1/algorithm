package baekjoon.silver.no14916;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int money = Integer.parseInt(br.readLine());
        int coin = money / 5;
        while(coin >= 0) {
            if((money - coin * 5) % 2 == 0) {
                coin += (money - coin * 5) / 2;
                bw.write(coin + "\n");

                bw.flush();
                bw.close();
                br.close();
                return;
            }
            coin--;
        }

        bw.write("-1");

        bw.flush();
        bw.close();
        br.close();
    }
}
