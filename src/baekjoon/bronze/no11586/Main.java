package baekjoon.bronze.no11586;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] mirror = new String[n];

        for(int i = 0; i < n; i++) {
            mirror[i] = br.readLine();
        }

        int state = Integer.parseInt(br.readLine());

        if(state == 1) {
            for(int i = 0; i < n; i++) {
                bw.write(mirror[i] + "\n");
            }
        } else if(state == 2) {
            for(int i = 0; i < n; i++) {
                String line = "";
                for(int j = mirror[i].length()-1; j >= 0; j--) {
                    line += mirror[i].charAt(j);
                }
                bw.write(line + "\n");
            }
        } else if(state == 3) {
            for(int i = n-1; i >= 0; i--) {
                bw.write(mirror[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
