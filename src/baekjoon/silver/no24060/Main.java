package baekjoon.silver.no24060;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count = 0;
    static int x;
    static int ans = -1;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] temp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, temp, 0, arr.length-1);
        bw.write(ans + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right) throws IOException {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid+1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) throws IOException {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i];
                count++;
                if(count == x) ans = arr[i];
                i++;
            } else {
                temp[k++] = arr[j];
                count++;
                if(count == x) ans = arr[j];
                j++;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i];
            count++;
            if(count == x) ans = arr[i];
            i++;
        }

        while (j <= right) {
            temp[k++] = arr[j];
            count++;
            if(count == x) ans = arr[j];
            j++;
        }

        for (int idx = left; idx <= right; idx++) {
            arr[idx] = temp[idx];
        }
    }
}
