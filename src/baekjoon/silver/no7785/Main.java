package baekjoon.silver.no7785;

import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Set<String> set = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String type = st.nextToken();

            if(type.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        Object[] arr = set.toArray();
        for(int i = arr.length-1; i >= 0; i--) {
            bw.write(arr[i].toString() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
