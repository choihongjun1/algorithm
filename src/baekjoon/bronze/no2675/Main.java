package baekjoon.bronze.no2675;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int test = sc.nextInt();
        String[] result = new String[test];
        for(int i = 0; i < test; i++){
            String repeatStr = "";
            int r = sc.nextInt();
            String str = sc.next();
            for(int j = 0; j < str.length(); j++){
                repeatStr += String.valueOf(str.charAt(j)).repeat(r);
            }
            result[i] = repeatStr;
        }
        for(String s : result) System.out.println(s);
    }
}
