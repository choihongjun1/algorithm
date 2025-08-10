package baekjoon.bronze.no4101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a != 0 || b != 0) {
            if(a > b) result.add("Yes");
            else result.add("No");
            a = sc.nextInt();
            b = sc.nextInt();
        }

        for(String s : result) System.out.println(s);
    }
}
