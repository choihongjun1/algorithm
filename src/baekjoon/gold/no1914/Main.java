package baekjoon.gold.no1914;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        bw.write(BigInteger.TWO.pow(n).subtract(BigInteger.ONE) + "\n");

        if(n <= 20) {
            for(int i = 1; i <= 3; i++) {
                for(int j = 1; j <= 3; j++) {
                    if(i != j) {
                        map.put("1," + i + "," + j, i + " " + j + "\n");
                    }
                }
            }

            for(int i = 2; i <= n-1; i++) {
                for(int start = 1; start <= 3; start++) {
                    for(int end = 1; end <= 3; end++) {
                        if(start != end) {
                            map.put(i + "," + start + "," + end,
                                    map.get(i - 1 + "," + start + "," + (6 - start - end)) +
                                    map.get("1," + start + "," + end) +
                                    map.get(i - 1 + "," + (6 - start - end) + "," + end));
                        }
                    }
                }
            }

            bw.write(map.get(n - 1 + "," + 1 + "," + 2) +
                    map.get("1," + 1 + "," + 3) +
                    map.get(n - 1 + "," + 2 + "," + 3));
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
