package baekjoon.bronze.no11719;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> line = new ArrayList<String>();
        while(sc.hasNext()) {
            line.add(sc.nextLine());
        }
        for(String s : line) System.out.println(s);
    }
}
