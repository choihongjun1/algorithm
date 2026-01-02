package baekjoon.bronze.no24051;

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

        bw.write(insertionSort(arr) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int loc = i - 1;
            int newItem = arr[i];

            while (0 <= loc && newItem < arr[loc]) {
                arr[loc + 1] = arr[loc];
                if(++count == k) return arr[loc+1];
                loc--;
            }

            if (loc + 1 != i) {
                arr[loc + 1] = newItem;
                if(++count == k) return arr[loc+1];
            }
        }

        return -1;
    }
}
