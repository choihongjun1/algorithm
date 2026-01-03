package baekjoon.platinum.no1019;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long[][] arr;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int l = s.length();
        int n = Integer.parseInt(s);
        arr = new long[l][10];

        // 1~9 페이지
        for(int i = 1; i < 10; i++) {
            arr[0][i] = 1;
        }

        for(int i = 1; i < l-1; i++) {
            // 1 ~ 10^(l-1)-1 페이지
            for(int j = 0; j < 10; j++) {
                arr[i][j] = arr[i-1][j] * 10;
                arr[i][j] += Math.pow(10, i);
            }
            arr[i][0]--;
        }

        long[] answer = new long[10];
        f(n, l, answer);

        for(int i = 0; i < answer.length-1; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write(answer[answer.length-1] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void f(int n, int l, long[] answer) {
        if(l == 1) {
            for(int i = 1; i <= n; i++) {
                answer[i] += 1;
            }
            return;
        }

        int pow = (int)Math.pow(10, l-1);
        int first = n / pow;
        int r = n - first * pow;
        int rLen = String.valueOf(r).length();
        int oneRepeat = Integer.parseInt("1".repeat(l-1));

        for(int i = 0; i < 10; i++) {
            answer[i] += arr[l-2][i] * first;
            if(i != 0 && i < first) answer[i] += pow; // 맨 위
            else if(i == 0) answer[i] += oneRepeat * (first-1);
        }

        answer[first] += r + 1; // 맨 위
        if(r > pow / 10) {
            answer[0] += oneRepeat;
        } else {
            answer[0] += (long)(l-1-rLen) * (r+1) + Integer.parseInt("1".repeat(rLen));
        }

        f(r, rLen, answer);
    }
}
