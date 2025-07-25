package baekjoon.bronze.no2720;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] result = new String[t];

        for(int i = 0; i < t; i++) {
            int money = Integer.parseInt(br.readLine());
            int quarter = money / 25;
            money %= 25;
            int dime = money / 10;
            money %= 10;
            int nickel = money / 5;
            int penny = money %= 5;

            result[i] = quarter + " " + dime + " " + nickel + " " + penny;
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
