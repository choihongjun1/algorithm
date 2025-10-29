package baekjoon.silver.no20291;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String file = sc.next();
            String name = "";
            String hjj = "";
            boolean flag = false;
            for(int j = 0; j < file.length(); j++) {
                char c = file.charAt(j);
                if(c == '.') {
                    flag = true;
                    continue;
                }
                if(flag) hjj += c;
            }

            if(map.containsKey(hjj)) {
                map.replace(hjj, map.get(hjj) + 1);
            } else {
                map.put(hjj, 1);
            }
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getKey() + " " + entry.getValue());
        }
        Collections.sort(result);

        for(String s : result) {
            System.out.println(s);
        }
    }
}
