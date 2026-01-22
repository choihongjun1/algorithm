package baekjoon.silver.no24091;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, k;
    static long count = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        quickSort(arr, 0, n-1);

        if(count < k) System.out.println("-1");

        bw.flush();
        bw.close();
    }

    public static void quickSort(int[] arr, int low, int high) throws IOException {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) throws IOException {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        if(i+1 != high) swap(arr, i+1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) throws IOException {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        if(++count == k) {
            for(int x = 0; x < n-1; x++) {
                bw.write(arr[x] + " ");
            }
            bw.write(arr[n-1] + "\n");

            bw.flush();
            bw.close();
            System.exit(0);
        }
    }
}

