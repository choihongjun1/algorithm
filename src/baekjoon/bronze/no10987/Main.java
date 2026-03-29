package baekjoon.bronze.no10987;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] vowel = new char[] {'a', 'e', 'i', 'o', 'u'};
        String word = br.readLine();
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for(int j = 0; j < vowel.length; j++) {
                if(c == vowel[j]) {
                    count++;
                    break;
                }
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
