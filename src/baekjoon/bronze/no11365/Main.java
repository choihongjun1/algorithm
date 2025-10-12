package baekjoon.bronze.no11365;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<String> result = new ArrayList<>();
        String line = br.readLine();
        while(!line.equals("END")) {
            line = reverse(line);
            result.add(line);
            line = br.readLine();
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

    public static String reverse(String line) {
        String reverse = "";
        for(int i = line.length()-1; i >= 0; i--) {
            reverse += line.charAt(i);
        }
        return reverse;
    }
}
