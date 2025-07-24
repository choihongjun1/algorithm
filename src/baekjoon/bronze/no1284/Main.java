package baekjoon.bronze.no1284;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        String num = sc.next();
        while(!num.equals("0")) {
            int sum = 2; // 양끝 너비
            sum += num.length()-1; // 숫자 사이 너비
            sum += num.length() * 3; // 숫자 너비
            for(int i = 0; i < num.length(); i++) {
                if(num.charAt(i) == '1') sum--;
                if(num.charAt(i) == '0') sum++;
            }
            result.add(sum);
            num = sc.next();
        }

        for(int i : result) System.out.println(i);
    }
}
