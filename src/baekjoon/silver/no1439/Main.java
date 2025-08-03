package baekjoon.silver.no1439;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int count = 0;
        char c = str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1) && str.charAt(i) != c) count++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
