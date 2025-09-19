package baekjoon.silver.no4659;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<String> result = new ArrayList<>();
        String password = br.readLine();
        while(!password.equals("end")) {
            if(accept(password)) result.add("<" + password + "> is acceptable.");
            else result.add("<" + password + "> is not acceptable.");
            password = br.readLine();
        }

        for(String s : result) bw.write(s+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean accept(String password) {
        if(!containVowel(password)) return false;

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if(i != password.length() - 1) {
                char next = password.charAt(i+1);
                if(c == next && !(c == 'e' || c == 'o')) return false;

                if(i != password.length() - 2) {
                    char next2 = password.charAt(i+2);
                    if((isVowel(c) + isVowel(next) + isVowel(next2)) % 3 == 0) return false;
                }
            }

        }

        return true;
    }

    public static boolean containVowel(String password) {
        String[] vowel = {"a", "e", "i", "o", "u"};
        for(String w : vowel) {
            if(password.contains(w)) return true;
        }
        return false;
    }

    public static int isVowel(char c) {
        if("aieou".contains(String.valueOf(c))) return 1;
        else return 0;
    }
}
