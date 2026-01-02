package baekjoon.silver.no24061;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    static int x;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] temp = new int[n];
        mergeSort(arr, temp, 0, arr.length-1);

        if(count < x) bw.write("-1");
        else bw.write(sb.toString().trim());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid+1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int idx = left; idx <= right; idx++) {
            arr[idx] = temp[idx];
            count++;
            if(count == x) {
                for(int num : arr) {
                    sb.append(num).append(" ");
                }
            }
        }
    }
}
