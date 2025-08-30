package baekjoon.silver.no32004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int result1 = 0;
        int result2 = 0;
        String result3 = "";
        List<Integer> max = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            int len = sc.nextInt();
            result1 += len;
            for(int j = 1; j <= len; j++) {
                int num = sc.nextInt();

                if(i == a) setA.add(num);
                else if(i == b) setB.add(num);

                if(max.size() < j) max.add(num);
                else if(max.get(j-1) < num) max.set(j-1, num);
            }
        }

        setA.retainAll(setB);
        for(int num : setA) {
            result2 += num;
        }

        for(int num : max) {
            result3 += num + " ";
        }

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3.trim());

    }
}
