package baekjoon.bronze.no2774;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String num = sc.next();
            for(int j = 0; j < num.length(); j++) {
                set.add(num.charAt(j));
            }
            list.add(set.size());
            set.clear();
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}
