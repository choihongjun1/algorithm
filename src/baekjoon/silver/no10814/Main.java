package baekjoon.silver.no10814;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] age = new int[n];
        String[] name = new String[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            age[i] = Integer.parseInt(st.nextToken());
            name[i] = st.nextToken();
        }

        int[] temp = new int[n];
        String[] temp2 = new String[n];
        mergeSort(age, temp, name, temp2, 0, n-1);

        for(int i = 0; i < n; i++) {
            bw.write(age[i] + " " + name[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int[] arr, int[] temp, String[] arr2, String[] temp2, int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, arr2, temp2, left, mid);
            mergeSort(arr, temp, arr2, temp2, mid+1, right);
            merge(arr, temp, arr2, temp2, left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] temp, String[] arr2, String[] temp2, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                temp2[k] = arr2[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                temp2[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            temp[k] = arr[i];
            temp2[k] = arr2[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            temp2[k] = arr2[j];
            k++;
            j++;
        }

        for (int idx = left; idx <= right; idx++) {
            arr[idx] = temp[idx];
            arr2[idx] = temp2[idx];
        }
    }
}
