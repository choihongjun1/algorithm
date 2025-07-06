package alkon.week1.no1966;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cases = sc.nextInt();
        int[] result = new int[cases];

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < cases; i++) {
            int n = sc.nextInt();
            int targetIndex = sc.nextInt();

            queue.clear();
            for(int j = 0; j < n; j++) {
                queue.offer(sc.nextInt());
            }

            // 하나를 꺼내서 큐에서 더 큰 수가 있으면 다시 넣기
            while(!queue.isEmpty()) {
                int num = queue.poll();
                result[i]++;

                for(int k : queue) {
                    if(k > num) {
                        queue.offer(num);
                        result[i]--;
                        if(targetIndex == 0) {
                            targetIndex = queue.size();
                        }
                        break;
                    }
                }

                if(targetIndex == 0) {
                    break;
                }

                targetIndex--;
            }
        }

        for(int i : result) {
            System.out.println(i);
        }

    }
}
