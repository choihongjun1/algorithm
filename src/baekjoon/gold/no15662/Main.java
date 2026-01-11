package baekjoon.gold.no15662;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String[] gear;
    static int t;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        gear = new String[t];
        for(int i = 0; i < t; i++) {
            gear[i] = br.readLine();
        }

        int k = Integer.parseInt(br.readLine());
        for(int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());
            rotation(number, direction, 0);
        }

        int count = 0;
        for(int i = 0; i < gear.length; i++) {
            if(gear[i].charAt(0) == '1') count++;
        }
        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void rotation(int number, int direction, int right) {
        if(right != -1 && number+1 <= t && gear[number-1].charAt(2) != gear[number].charAt(6)) {
            rotation(number+1, direction * -1, 1);
        }
        if(right != 1 && number-1 >= 1 && gear[number-1].charAt(6) != gear[number-2].charAt(2)) {
            rotation(number-1, direction * -1, -1);
        }

        if(direction == 1) {
            gear[number-1] = gear[number-1].charAt(7) + gear[number-1].substring(0, 7);
        } else {
            gear[number-1] = gear[number-1].substring(1) + gear[number-1].charAt(0);
        }
    }
}
