package baekjoon.bronze.no15552;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> result = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] num = br.readLine().split(" ");
            result.add(String.valueOf(Integer.parseInt(num[0]) + Integer.parseInt(num[1])));
        }
        for(String s : result) bw.write(s+"\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
