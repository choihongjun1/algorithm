package baekjoon.bronze.no28290;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        if(str.equals("asdfjkl;")) System.out.println("stairs");
        else if(str.equals(";lkjfdsa")) System.out.println("reverse");
        else if(str.equals("fdsajkl;") || str.equals("jkl;fdsa")) System.out.println("in-out");
        else if(str.equals("asdf;lkj") || str.equals(";lkjasdf")) System.out.println("out-in");
        else System.out.println("molu");
    }
}
