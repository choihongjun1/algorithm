package baekjoon.silver.no9184;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("0,0,0", 1);
        List<String> result = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while(!(a == -1 && b == -1 && c == -1)) {
            result.add("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }

        for(String s : result) System.out.println(s);
    }

    public static int w(int a, int b, int c) {
        if(map.get(a+","+b+","+c) != null) {
            return map.get(a+","+b+","+c);
        }
        if (a <= 0 || b <= 0 || c <= 0) return map.get("0,0,0");
        if (a > 20 || b > 20 || c > 20) return w(20,20,20);
        if (a < b && b < c) {
            map.put(a+","+b+","+c, w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c));
            return map.get(a+","+b+","+c);
        }
        map.put(a+","+b+","+c,w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1));
        return map.get(a+","+b+","+c);
    }
}
