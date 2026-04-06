package baekjoon.silver.no25757;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        if(game.equals("Y")) bw.write(set.size() + "\n");
        else if(game.equals("F")) bw.write(set.size() / 2 + "\n");
        else bw.write(set.size() / 3 + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
