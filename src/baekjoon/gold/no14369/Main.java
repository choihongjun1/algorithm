package baekjoon.gold.no14369;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++) {
            bw.write("Case #" + i + ": " + phoneNumber(br.readLine()) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static String phoneNumber(String s) {
        int[] alphabet = new int[26];
        int[] number = new int[10];

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabet[c-'A']++;
        }

        if(alphabet['Z'-'A'] > 0) {
            number[0] += alphabet['Z'-'A'];
            alphabet['O'-'A'] -= alphabet['Z'-'A'];
        }

        if(alphabet['W'-'A'] > 0) {
            number[2] += alphabet['W'-'A'];
            alphabet['O'-'A'] -= alphabet['W'-'A'];
        }

        if(alphabet['U'-'A'] > 0) {
            number[4] += alphabet['U'-'A'];
            alphabet['F'-'A'] -= alphabet['U'-'A'];
            alphabet['O'-'A'] -= alphabet['U'-'A'];
        }

        if(alphabet['X'-'A'] > 0) {
            number[6] += alphabet['X'-'A'];
            alphabet['S'-'A'] -= alphabet['X'-'A'];
            alphabet['I'-'A'] -= alphabet['X'-'A'];
        }

        if(alphabet['G'-'A'] > 0) {
            number[8] += alphabet['G'-'A'];
            alphabet['I'-'A'] -= alphabet['G'-'A'];
            alphabet['H'-'A'] -= alphabet['G'-'A'];
        }

        if(alphabet['O'-'A'] > 0) number[1] += alphabet['O'-'A'];

        if(alphabet['H'-'A'] > 0) number[3] += alphabet['H'-'A'];

        if(alphabet['F'-'A'] > 0) {
            number[5] += alphabet['F'-'A'];
            alphabet['I'-'A'] -= alphabet['F'-'A'];
        }

        if(alphabet['S'-'A'] > 0) number[7] += alphabet['S'-'A'];

        number[9] += alphabet['I'-'A'];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            sb.append(String.valueOf(i).repeat(number[i]));
        }
        return sb.toString();
    }
}
