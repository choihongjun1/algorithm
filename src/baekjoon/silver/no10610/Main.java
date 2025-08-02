package baekjoon.silver.no10610;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String n = br.readLine();
        if(n.contains("0")) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n.length(); i++) {
                int num =  Integer.parseInt(n.substring(i, i+1));
                sum += num;
                list.add(num);
            }

            if(sum % 3 == 0) {
                list.sort(Collections.reverseOrder());
                String result = "";
                for(int i = 0; i < list.size(); i++) {
                    result += String.valueOf(list.get(i));
                }
                bw.write(result);
            } else {
                bw.write("-1");
            }
        } else {
            bw.write("-1");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
