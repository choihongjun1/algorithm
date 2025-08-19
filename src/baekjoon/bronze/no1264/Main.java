package baekjoon.bronze.no1264;

import java.io.*;
import java.util.ArrayList;
import java.util.List;;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Integer> result = new ArrayList<>();

        String line = br.readLine();
        while(!line.equals("#")) {
            int count = 0;
            for(int i = 0; i < line.length(); i++) {
                if("aieouAIEOU".contains(String.valueOf(line.charAt(i)))) {
                    count++;
                }
            }
            result.add(count);

            line = br.readLine();
        }

        for(int i : result) bw.write(i + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
