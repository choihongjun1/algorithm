package baekjoon.bronze.no2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String abc = String.valueOf(a * b * c);

        int[] count = new int[10];
        for(int i = 0; i < abc.length(); i++){
            int index = Integer.parseInt(abc.substring(i, i+1));
            count[index]++;
        }

        for(int i = 0; i < count.length; i++){
            System.out.println(count[i]);
        }
    }
}
