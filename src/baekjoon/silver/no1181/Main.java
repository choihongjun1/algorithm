package baekjoon.silver.no1181;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Set<String>[] set = new TreeSet[50];
        for(int i = 0; i < 50; i++) {
            set[i] = new TreeSet<>();
        }

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String word = br.readLine();
            set[word.length()-1].add(word);
        }

        for(int i = 0; i < 50; i++) {
            for(String s : set[i]) {
                bw.write(s + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
