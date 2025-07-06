package alkon.week1.no1158;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        Queue<Integer> queue = new LinkedList<>();

        int removeIndex = k-1;
        while(!list.isEmpty()) {
            queue.offer(list.remove(removeIndex));
            if(!list.isEmpty()) {
                removeIndex = (removeIndex + k - 1) % list.size();
            }
        }

        // 결과 출력
        String result = "";
        while(!queue.isEmpty()) {
            result += queue.poll();
            if(!queue.isEmpty()) {
                result += ", ";
            }
        }
        System.out.println("<" + result + ">");
    }
}
