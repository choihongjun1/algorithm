package baekjoon.bronze.no11549;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int tea = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < 5; i++) {
            int answer = Integer.parseInt(st.nextToken());
            if(answer == tea) count++;
        }
        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
