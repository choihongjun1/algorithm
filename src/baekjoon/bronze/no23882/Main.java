package baekjoon.bronze.no23882;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int k;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        selectionSort(arr);
        if(count != k) bw.write("-1");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void selectionSort(int[] arr) throws IOException {
        for(int i = arr.length-1; i > 0; i--) {
            int max = 0;
            for(int j = 1; j <= i; j++) {
                if(arr[j] > arr[max]) max = j;
            }

            if(max != i) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
                if(++count == k) {
                    for(int j = 0; j < arr.length-1; j++) {
                        bw.write(arr[j] + " ");
                    }
                    bw.write(arr[arr.length-1] + "\n");
                    return;
                }
            }
        }
    }
}
