package baekjoon.silver.no10866;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String op = sc.next();
            if(op.equals("push_front")) {
                deque.offerFirst(sc.nextInt());
            } else if(op.equals("push_back")) {
                deque.offerLast(sc.nextInt());
            } else if(op.equals("pop_front")) {
                if(deque.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(deque.pollFirst());
                }
            } else if(op.equals("pop_back")) {
                if(deque.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(deque.pollLast());
                }
            } else if(op.equals("size")) {
                list.add(deque.size());
            } else if(op.equals("empty")) {
                if(deque.isEmpty()) {
                    list.add(1);
                } else {
                    list.add(0);
                }
            } else if(op.equals("front")) {
                if(deque.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(deque.peekFirst());
                }
            } else if(op.equals("back")) {
                if(deque.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(deque.peekLast());
                }
            }
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}
