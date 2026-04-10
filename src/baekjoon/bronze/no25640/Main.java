package baekjoon.bronze.no25640;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String mbti = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(br.readLine().equals(mbti)) count++;
        }
        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
