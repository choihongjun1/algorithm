package baekjoon.gold.no12015;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int len = 0;
        int[] remember = new int[n];
        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            int low = lowerBound(remember, x, len);
            if(low == len) remember[len++] = x;
            else remember[low] = x;
        }

        bw.write(len + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int lowerBound(int[] arr, int target, int len) {
        int low = 0;
        int high = len;

        while(low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < target) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
