package baekjoon.bronze.no20528;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] word = br.readLine().split(" ");
        boolean b = true;
        char c = word[0].charAt(0);
        for(int i = 1; i < word.length; i++) {
            if(word[i].charAt(0) != c) {
                b = false;
                break;
            }
        }

        if(b) bw.write("1");
        else bw.write("0");

        br.close();
        bw.flush();
        bw.close();
    }
}
