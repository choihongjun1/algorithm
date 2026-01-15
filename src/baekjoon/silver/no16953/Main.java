package baekjoon.silver.no16953;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 1;

        while(true) {
            if(b < a) {
                bw.write("-1");
                break;
            }

            if(b % 2 == 0) {
                b /= 2;
                count++;
            } else if(b % 10 == 1) {
                b -= 1;
                b /= 10;
                count++;
            } else if(b % 10 != 1) {
                bw.write("-1");
                break;
            }

            if(b == a) {
                bw.write(count + "\n");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
