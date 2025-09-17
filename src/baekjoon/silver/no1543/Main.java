package baekjoon.silver.no1543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        int count = 0;
        doc = doc.replace(word, "-");
        for(int i = 0; i < doc.length(); i++) {
            if(doc.charAt(i) == '-') count++;
        }
        System.out.println(count);
    }
}
