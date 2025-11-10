package baekjoon.silver.no1515;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = sc.next();
        int n = 1;
        String str = "1";

        for(int i = 0; i < sequence.length(); i++) {
            char c =sequence.charAt(i);
            while(!str.contains(String.valueOf(c))) {
                n++;
                str += String.valueOf(n);
            }
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == c) {
                    str = str.substring(j+1);
                    break;
                }
            }
        }

        System.out.println(n);
    }
}
