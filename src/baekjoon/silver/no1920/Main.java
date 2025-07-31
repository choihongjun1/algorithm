package baekjoon.silver.no1920;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        String[] line2 = br.readLine().split(" ");
        for(int i = 0; i < m; i++) {
            int target = Integer.parseInt(line2[i]);
            if(binarySearch(arr, target) != -1) bw.write("1\n");
            else bw.write("0\n");
        }

        bw.flush();
        bw.close();
        br.close();
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
