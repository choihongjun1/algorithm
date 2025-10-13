package baekjoon.silver.no1652;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] col = new String[n];
        for(int i = 0; i < col.length; i++) col[i] = "";
        int rowCount = 0;
        int colCount = 0;

        for(int i = 0; i < n; i++) {
            String line = sc.next();
            rowCount += findSpot(line);
            for(int j = 0; j < n; j++) {
                col[j] += line.charAt(j);
            }
        }

        for(String c : col) {
            colCount += findSpot(c);
        }

        System.out.println(rowCount + " " + colCount);
    }

    public static int findSpot(String line) {
        int count = 0;
        String[] split = line.split("X");
        for(int i = 0; i < split.length; i++) {
            if(split[i].length() >= 2) count++;
        }
        return count;
    }
}
