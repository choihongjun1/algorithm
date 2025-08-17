package baekjoon.silver.no9656;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String[] winners;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        winners = new String[n];
        if(n > 3) {
            winners[1] = "CY";
            winners[2] = "SK";
            winners[3] = "CY";
        }

        bw.write(game(n, 0));

        bw.flush();
        bw.close();
        br.close();
    }

    public static String game(int n, int turn) {
        String[] players = {"SK", "CY"};
        if(n <= 3) return players[n % 2];

        if(winners[n-1] == null) winners[n-1] = game(n-1, (turn + 1) % 2);
        if(winners[n-3] == null) winners[n-3] = game(n-3, (turn + 1) % 2);

        String one = winners[n-1];
        String three = winners[n-3];
        if(one.equals(three)) return one.equals("SK") ? "CY" : "SK";
        else return players[turn];
    }
}
