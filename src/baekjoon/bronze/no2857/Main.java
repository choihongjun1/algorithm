package baekjoon.bronze.no2857;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";

        for(int i = 1; i <= 5; i++) {
            String name = sc.next();
            if(name.contains("FBI")) {
                result += i + " ";
            }
        }

        if(result.equals("")) System.out.println("HE GOT AWAY!");
        else System.out.println(result.trim());
    }
}
