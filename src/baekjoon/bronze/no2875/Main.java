package baekjoon.bronze.no2875;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int female = Integer.parseInt(st.nextToken());
        int male = Integer.parseInt(st.nextToken());
        int intern = Integer.parseInt(st.nextToken());
        int team = Math.min(female / 2, male);
        intern -= female + male - 3 * team;
        if(intern > 0) team -= (intern - 1) / 3 + 1;

        bw.write(team + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
