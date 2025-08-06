package baekjoon.bronze.no30031;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = 0;
        for(int i = 0; i < n; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            if(width == 136) money += 1000;
            else if(width == 142) money += 5000;
            else if(width == 148) money += 10000;
            else if(width == 154) money += 50000;
        }
        System.out.println(money);
    }
}
