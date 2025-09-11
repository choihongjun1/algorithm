package baekjoon.bronze.no11557;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] result = new String[t];
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String[] names = new String[n];
            int max = 0;
            int maxIndex = 0;

            for(int j = 0; j < n; j++) {
                names[j] = sc.next();
                int drink = sc.nextInt();
                if(drink > max) {
                    max = drink;
                    maxIndex = j;
                }
            }

            result[i] = names[maxIndex];
        }

        for(String name : result) System.out.println(name);
    }
}
