package baekjoon.silver.no2670;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            System.out.printf("%.3f", Double.parseDouble(br.readLine()));
            br.close();
            return;
        }

        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double max = 0;
        for(int i = 0; i < n; i++) {
            double mul = arr[i];
            if(mul > max) max = mul;
            for(int j = i+1; j < n; j++) {
                mul = mul * arr[j];
                if(mul > max) max = mul;
            }
        }

        System.out.printf("%.3f", max);

        br.close();
    }
}
