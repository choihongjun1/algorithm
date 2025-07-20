package baekjoon.bronze.no5086;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a != 0 || b != 0) {
            if(b % a == 0) result.add("factor");
            else if(a % b == 0) result.add("multiple");
            else result.add("neither");
            a = sc.nextInt();
            b = sc.nextInt();
        }

        for(String s : result) System.out.println(s);
    }
}
