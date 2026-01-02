package baekjoon.bronze.no23968;

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

        bubbleSort(arr);
        if(count != k) bw.write("-1");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bubbleSort(int[] arr) throws IOException {
        for(int i = arr.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    if(++count == k) {
                        bw.write(arr[j] + " " + arr[j+1]);
                        return;
                    }
                }
            }
        }
    }
}
