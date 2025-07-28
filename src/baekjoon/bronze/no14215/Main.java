package baekjoon.bronze.no14215;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] side = new int[3];
        side[0] = sc.nextInt();
        side[1] = sc.nextInt();
        side[2] = sc.nextInt();

        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < side.length; i++) {
            if(max < side[i]) {
                max = side[i];
                maxIndex = i;
            }
        }
        int sum = 0;
        for(int i = 0; i < side.length; i++) {
            if(i != maxIndex) sum += side[i];
        }

        while(max >= sum) {
            max--;
        }
        System.out.println(max + sum);

    }

}
