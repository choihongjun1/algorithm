package baekjoon.silver.no25206;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();
        gpaMap.put("A+",4.5);
        gpaMap.put("A0",4.0);
        gpaMap.put("B+",3.5);
        gpaMap.put("B0",3.0);
        gpaMap.put("C+",2.5);
        gpaMap.put("C0",2.0);
        gpaMap.put("D+",1.5);
        gpaMap.put("D0",1.0);
        gpaMap.put("F",0.0);

        double gpa = 0;
        int sum = 0;
        for(int i = 0; i < 20; i++) {
            sc.next();
            double hour = sc.nextDouble();
            String grade = sc.next();
            if(grade.equals("P")) continue;
            double score = gpaMap.get(grade);
            gpa += hour * score;
            sum += hour;
        }
        gpa /= sum;
        System.out.println(gpa);
    }
}
