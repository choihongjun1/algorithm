package baekjoon.bronze.no15098;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] line = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for(String word : line) {
            set.add(word);
        }

        if(set.size() == line.length) bw.write("yes\n");
        else bw.write("no\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
