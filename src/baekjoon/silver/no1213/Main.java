package baekjoon.silver.no1213;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < name.length(); i++) {
            list.add(name.charAt(i));
        }
        Collections.sort(list);

        String palindrome = "";
        int count = 0;
        String mid = "";
        for(int i = 0; i < list.size(); i++) {
            if(i != list.size()-1 && list.get(i) == list.get(i+1)) {
                palindrome += list.get(i);
                i += 1;
            } else {
                count++;
                if(count > 1) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                mid = String.valueOf(list.get(i));
            }
        }

        System.out.println(palindrome + mid + reverse(palindrome));
    }

    public static String reverse(String s) {
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
