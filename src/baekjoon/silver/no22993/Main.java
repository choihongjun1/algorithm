package baekjoon.silver.no22993;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] damage = br.readLine().split(" ");
        long myDamage = Integer.parseInt(damage[0]);
        damage[0] = "0";
        Arrays.sort(damage);

        for (int i = 1; i < n; i++) {
            if(myDamage > Integer.parseInt(damage[i])) {
                myDamage += Integer.parseInt(damage[i]);
            } else if(myDamage <= Integer.parseInt(damage[i])) {
                bw.write("No\n");

                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }
        bw.write("Yes\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
