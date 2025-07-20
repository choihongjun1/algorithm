package baekjoon.bronze.no9506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<String> list = new ArrayList<>(); // 결과

        while(n != -1) {
            List<Integer> divisor = new ArrayList<>(); // 약수 리스트

            // 약수 합 구하기
            int sum = 0;
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    divisor.add(i);
                    sum += i;
                }
            }

            String result = "";
            if(sum == n) {
                result = n + " = ";
                for(int i = 0; i < divisor.size(); i++) {
                    result += divisor.get(i);
                    if(i != divisor.size() - 1) result += " + ";
                }
            } else {
                result = n + " is NOT perfect.";
            }
            list.add(result);

            n = sc.nextInt();
        }

        for(String s : list) {
            System.out.println(s);
        }
    }
}
