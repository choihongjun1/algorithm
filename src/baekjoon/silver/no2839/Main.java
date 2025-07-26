package baekjoon.silver.no2839;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int three = 0;
        int five = n / 5;
        while(five != -1) {
            if((n - five * 5) % 3 == 0) {
                three = (n - five * 5) / 3;
                break;
            }
            five--;
        }

        if(five == -1) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(String.valueOf(five + three)));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
