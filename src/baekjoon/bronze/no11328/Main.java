package baekjoon.bronze.no11328;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] result = new boolean[n];
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String s1 = line[0];
            String s2 = line[1];

            result[i] = strfry(s1, s2);
        }

        for(boolean b : result) bw.write(b ? "Possible\n" : "Impossible\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean strfry(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] arr1 = new char[s1.length()];
        char[] arr2 = new char[s2.length()];
        for(int j = 0; j < s1.length(); j++) {
            arr1[j] = s1.charAt(j);
            arr2[j] = s2.charAt(j);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int j = 0; j < s1.length(); j++) {
            if(arr1[j] != arr2[j]) return false;
        }
        return true;
    }
}
