package alkon.week2.no9291;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] board = new int[9][9];

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean[] result = new boolean[n]; // 각 케이스 결과

        for(int t = 1; t <= n; t++) {
            // 스도쿠 초기화
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            result[t-1] = success();
        }

        // 결과 출력
        for(int t = 1; t <= n; t++) {
            if(result[t-1]) {
                System.out.println("Case " + t + ": CORRECT");
            } else {
                System.out.println("Case " + t + ": INCORRECT");
            }
        }
    }

    // 스도쿠 성공 확인
    public static boolean success() {
        int[] col = new int[9];
        for(int i = 0; i < 9; i++) {
            if(check(board[i])) { // row 검사
                for(int j = 0; j < 9; j++) {
                    // 3x3 검사
                    if(i % 3 == 0 && j % 3 == 0) {
                        int[] box = new int[9];
                        int count = 0;
                        for(int k = 0; k < 3; k++) {
                            for(int l = 0; l < 3; l++) {
                                box[count++] = board[i+k][j+l];
                            }
                        }
                        if(!check(box)) return false;
                    }

                    col[j] = board[j][i];
                }
                if(!check(col)) { // col 중복
                    return false;
                }
            } else { // row 중복
                return false;
            }
        }
        return true;
    }

    // 1~9가 있는지 확인
    public static boolean check(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size() == 9;
    }
}
