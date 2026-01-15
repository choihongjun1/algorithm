package baekjoon.silver.no18242;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String[] arr = new String[r];
        for(int i = 0; i < r; i++) {
            arr[i] = br.readLine();
        }

        int start = -1;
        int end = 0;
        int row = 0;
        for(int i = 0; i < r; i++) {
            String line = arr[i];
            for(int j = 0; j < c; j++) {
                if(line.charAt(j) == '#') {
                    start = j;
                    for(int k = c-1; k > start; k--) {
                        if(line.charAt(k) == '#') {
                            end = k;
                            break;
                        }
                    }
                    break;
                }
            }

            if(start != -1) {
                row = i;
                break;
            }
        }

        int avg = (end - start) / 2;
        if(arr[row + avg].charAt(start) == '.') bw.write("LEFT");
        else if(arr[row + avg].charAt(end) == '.') bw.write("RIGHT");
        else if(arr[row].charAt(start + avg) == '.') bw.write("UP");
        else bw.write("DOWN");

        br.close();
        bw.flush();
        bw.close();
    }
}
