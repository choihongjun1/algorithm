package baekjoon.silver.no10815;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int[] temp = new int[n];
        mergeSort(card, temp, 0, card.length-1);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            if(binarySearch(card, Integer.parseInt(st.nextToken())) == -1) {
                sb.append("0 ");
            } else {
                sb.append("1 ");
            }
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
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
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
