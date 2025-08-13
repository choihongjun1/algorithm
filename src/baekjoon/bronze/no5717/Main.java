package baekjoon.bronze.no5717;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Integer> friends = new ArrayList<>();
        String[] friend = br.readLine().split(" ");
        int m = Integer.parseInt(friend[0]);
        int f = Integer.parseInt(friend[1]);
        while(m != 0 || f != 0) {
            friends.add(m+f);
            friend = br.readLine().split(" ");
            m = Integer.parseInt(friend[0]);
            f = Integer.parseInt(friend[1]);
        }

        for(int i : friends) bw.write(i + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
