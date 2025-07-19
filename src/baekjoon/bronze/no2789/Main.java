package baekjoon.bronze.no2789;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String cambridge = "CAMBRIDGE";
        String result = "";

        for(int i = 0 ; i < str.length() ; i++) {
            if(!cambridge.contains(String.valueOf(str.charAt(i)))) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
