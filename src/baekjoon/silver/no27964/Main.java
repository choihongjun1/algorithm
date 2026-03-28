package baekjoon.silver.no27964;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            String topping = st.nextToken();
            if(topping.length() >= 6 && topping.substring(topping.length()-6).equals("Cheese")) set.add(topping);
        }

        if(set.size() >= 4) bw.write("yummy");
        else bw.write("sad");

        br.close();
        bw.flush();
        bw.close();
    }
}
