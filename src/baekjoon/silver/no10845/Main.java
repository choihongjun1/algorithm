package baekjoon.silver.no10845;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int back = -1;

        for(int i = 0; i < n; i++) {
            String op = sc.next();
            if(op.equals("push")) {
                back = sc.nextInt();
                queue.offer(back);
            } else if(op.equals("pop")) {
                if(queue.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(queue.poll());
                }
            } else if(op.equals("size")) {
                list.add(queue.size());
            } else if(op.equals("empty")) {
                if(queue.isEmpty()) {
                    list.add(1);
                } else {
                    list.add(0);
                }
            } else if(op.equals("front")) {
                if(queue.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(queue.peek());
                }
            } else if(op.equals("back")) {
                if(queue.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(back);
                }
            }
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}
