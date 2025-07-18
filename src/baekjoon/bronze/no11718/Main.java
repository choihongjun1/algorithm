package baekjoon.bronze.no11718;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        while(sc.hasNext()) {
            list.add(sc.nextLine());
        }

        for(String s : list) {
            System.out.println(s);
        }
    }
}
