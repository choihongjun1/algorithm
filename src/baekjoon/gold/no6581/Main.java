package baekjoon.gold.no6581;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        int currLineLen = 0;
        String line = br.readLine();
        while(line != null) {
            StringBuilder word = new StringBuilder();
            for(int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if(c == ' ' || c == '\t') {
                    if(word.length() > 0) {
                        if(word.toString().equals("<br>")) {
                            if(result.length() > 0 && result.charAt(result.length()-1) == ' ') result.deleteCharAt(result.length()-1);
                            result.append("\n");
                            currLineLen = 0;
                        }
                        else if(word.toString().equals("<hr>")) {
                            if(result.length() > 0 && result.charAt(result.length()-1) == ' ') {
                                result.deleteCharAt(result.length()-1);
                                result.append("\n");
                            }
                            result.append("-".repeat(80)).append("\n");
                            currLineLen = 0;
                        }
                        else if(currLineLen + word.length() <= 80) {
                            result.append(word).append(" ");
                            currLineLen += word.length() + 1;
                        } else {
                            result.deleteCharAt(result.length() - 1);
                            result.append("\n").append(word).append(" ");
                            currLineLen = word.length() + 1;
                        }
                    }
                    word.setLength(0);
                } else {
                    word.append(c);
                }
            }
            if(word.length() > 0) {
                if(word.toString().equals("<br>")) {
                    if(result.length() > 0 && result.charAt(result.length()-1) == ' ') result.deleteCharAt(result.length()-1);
                    result.append("\n");
                    currLineLen = 0;
                }
                else if(word.toString().equals("<hr>")) {
                    if(result.length() > 0 && result.charAt(result.length()-1) == ' ') {
                        result.deleteCharAt(result.length()-1);
                        result.append("\n");
                    }
                    result.append("-".repeat(80)).append("\n");
                    currLineLen = 0;
                }
                else if(currLineLen + word.length() <= 80) {
                    result.append(word).append(" ");
                    currLineLen += word.length() + 1;
                } else {
                    result.deleteCharAt(result.length() - 1);
                    result.append("\n").append(word).append(" ");
                    currLineLen = word.length() + 1;
                }
            }

            line = br.readLine();
        }

        if(result.length() > 0 && result.charAt(result.length()-1) == ' ') {
            result.deleteCharAt(result.length()-1);
        }

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
