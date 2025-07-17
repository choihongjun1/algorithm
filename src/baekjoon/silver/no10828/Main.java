package baekjoon.silver.no10828;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            String op = sc.next();
            if(op.equals("push")) {
                stack.push(sc.nextInt());
            } else if(op.equals("pop")) {
                if(stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.pop());
                }
            } else if(op.equals("size")) {
                list.add(stack.size());
            } else if(op.equals("empty")) {
                if(stack.isEmpty()) {
                    list.add(1);
                } else {
                    list.add(0);
                }
            } else if(op.equals("top")) {
                if(stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
            }
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}
