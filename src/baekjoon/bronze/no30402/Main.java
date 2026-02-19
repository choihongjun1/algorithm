package baekjoon.bronze.no30402;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        for(int i = 0; i < 15; i++) {
            String line = br.readLine();
            if(line.contains("w")) {
                bw.write("chunbae");
                break;
            }
            else if(line.contains("b")) {
                bw.write("nabi");
                break;
            }
            else if(line.contains("g")) {
                bw.write("yeongcheol");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
