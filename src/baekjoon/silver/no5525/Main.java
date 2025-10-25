package baekjoon.silver.no5525;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int len = sc.nextInt();
        String s = sc.next();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < len-2; i++) {
            if(s.charAt(i) == 'I') {
                char curr = s.charAt(i+1);
                if(curr == 'I') continue;
                char next = s.charAt(i+2);

                int index = 0;
                int l = 0;
                while(curr == 'O' && next == 'I') {
                    index += 2;
                    l++;
                    if(i+index+1 >= len-1) break;
                    curr = s.charAt(i+index+1);
                    next = s.charAt(i+index+2);
                }

                if(l > 0) {
                    list.add(l);
                    i += 2*l;
                    if(i >= len-2) break;
                }
            }
        }

        int sum = 0;
        for(Integer i : list) {
            if(i >= n) sum += i - n + 1;
        }
        System.out.println(sum);
    }
}
