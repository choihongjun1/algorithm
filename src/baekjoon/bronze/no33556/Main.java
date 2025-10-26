package baekjoon.bronze.no33556;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        if(A.equals("null")) System.out.println("NullPointerException");
        else if(B.equals("null")) System.out.println("false");
        else if(A.equals(B)) System.out.println("true");
        else System.out.println("false");

        if(A.equals("null")) System.out.println("NullPointerException");
        else if(B.equals("null")) System.out.println("false");
        else if(A.equalsIgnoreCase(B)) System.out.println("true");
        else System.out.println("false");
    }
}
