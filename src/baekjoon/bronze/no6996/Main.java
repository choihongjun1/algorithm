package baekjoon.bronze.no6996;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            if(isAnagram(line[0], line[1])) {
                result[i] = line[0] + " & " + line[1] + " are anagrams.";
            } else {
                result[i] = line[0] + " & " + line[1] + " are NOT anagrams.";
            }
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        char[] str1 = new char[a.length()];
        char[] str2 = new char[b.length()];
        for(int i = 0; i < a.length(); i++) {
            str1[i] = a.charAt(i);
            str2[i] = b.charAt(i);
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i = 0; i < str1.length; i++) {
            if(str1[i] != str2[i]) return false;
        }
        return true;
    }
}
