package baekjoon.silver.no4779;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        List<String> result = new ArrayList<>();
        while(line != null) {
            int n = Integer.parseInt(line);
            result.add(cantorSet(n));
            line = br.readLine();
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static String cantorSet(int n) {
        if(n == 0) return "-";
        return cantorSet(n - 1) + " ".repeat((int)Math.pow(3, n-1)) + cantorSet(n - 1);
    }
}
