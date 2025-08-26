package baekjoon.silver.no15725;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String polynomial = sc.next();
        if(polynomial.contains("x")) {
            for(int i = 0; i < polynomial.length(); i++) {
                if(polynomial.charAt(i) == 'x') {
                    if(i == 0) System.out.println(1);
                    else if(i == 1 && polynomial.charAt(0) == '-') System.out.println(-1);
                    else System.out.println(polynomial.substring(0, i));
                    break;
                }
            }
        } else {
            System.out.println(0);
        }
    }
}
