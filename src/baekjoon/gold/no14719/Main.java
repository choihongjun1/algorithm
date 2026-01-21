package baekjoon.gold.no14719;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[width];
        for(int i = 0; i < width; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int rain = 0;
        for(int i = 1; i <= height; i++) {
            int left = 0;
            int right = width-1;
            boolean b1 = false;
            boolean b2 = false;

            while(left < right) {
                if(arr[left] < i) left++;
                else b1 = true;
                if(arr[right] < i) right--;
                else b2 = true;

                if(b1 && b2) break;
            }

            for(int j = left+1; j < right; j++) {
                if(arr[j] < i) rain++;
            }
        }

        bw.write(rain + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
