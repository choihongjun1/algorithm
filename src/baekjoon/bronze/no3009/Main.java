package baekjoon.bronze.no3009;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        int xFlag = 0;
        int yFlag = 0;

        for(int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            if(xList.contains(x)) xFlag = x;
            xList.add(x);
            int y = sc.nextInt();
            if(yList.contains(y)) yFlag = y;
            yList.add(y);
        }

        for(int i = 0; i < 3; i++) {
            if(xList.get(i) != xFlag) System.out.print(xList.get(i) + " ");
        }
        for(int i = 0; i < 3; i++) {
            if(yList.get(i) != yFlag) System.out.print(yList.get(i));
        }

    }
}
