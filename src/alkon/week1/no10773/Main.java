package alkon.week1.no10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int lines = sc.nextInt(); // 정수 개수

        // 정수 쓰기
        for(int i = 0; i < lines; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        // 합 구하기
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}

