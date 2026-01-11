package baekjoon.gold.no11761;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int out = st.nextToken().equals("out") ? 1 : 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = i;

        int count = 0;
        while(true) {
            shuffle(arr, out);
            count++;
            if(original(arr)) break;
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void shuffle(int[] arr, int out) {
        int[] temp = arr.clone();
        int index = 0;
        for(int i = 1-out; i < arr.length; i+=2) {
            arr[i] = temp[index++];
        }
        for(int i = out; i < arr.length; i+=2) {
            arr[i] = temp[index++];
        }
    }

    public static boolean original(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i) return false;
        }
        return true;
    }
}
