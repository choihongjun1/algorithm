package baekjoon.silver.no1302;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String book = sc.next();
            if(map.containsKey(book)) {
                map.replace(book, map.get(book) + 1);
            } else {
                map.put(book, 1);
            }
        }

        List<String> result = new ArrayList<>();
        int max = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
                result.clear();
                result.add(entry.getKey());
            } else if (max == entry.getValue()) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        System.out.println(result.get(0));
    }
}
