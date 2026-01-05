package baekjoon.gold.no1759;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int l, c;
    static boolean[] visited;
    static char[] arr, result;
    static boolean[] isVowel = new boolean[26];
    static int vowel = 0;
    static int consonant = 0;

    public static void main(String[] args) throws IOException {
        isVowel[0] = true;
        isVowel[4] = true;
        isVowel[8] = true;
        isVowel[14] = true;
        isVowel[20] = true;

        StringTokenizer st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new char[c];
        visited = new boolean[c];
        result = new char[l];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);

        bt(0, 0);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bt(int count, int num) throws IOException {
        if(count == l) {
            if(vowel >= 1 && consonant >= 2) {
                for(int i = 0; i < result.length; i++) {
                    bw.write(result[i]);
                }
                bw.write("\n");
            }
            return;
        }

        for(int i = num; i < c; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            if(isVowel[arr[i] - 'a']) vowel++;
            else consonant++;
            result[count] = arr[i];

            bt(count + 1, i + 1);

            if(isVowel[arr[i] - 'a']) vowel--;
            else consonant--;
            visited[i] = false;
        }
    }
}
