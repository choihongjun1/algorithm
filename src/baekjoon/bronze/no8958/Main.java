package baekjoon.bronze.no8958;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];

        for(int i = 0; i < t; i++) {
            String quiz = br.readLine();
            int score = 0;
            int o = 0;
            for(int j = 0; j < quiz.length(); j++) {
                if(quiz.charAt(j) == 'O') o++;
                else {
                    score += o * (o+1) / 2;
                    o = 0;
                }
            }
            score += o * (o+1) / 2;

            result[i] = score;
        }

        for(int i = 0; i < t; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
