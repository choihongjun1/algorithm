package alkon.week2.no2508;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); // 테스트 수

        for (int x = 0; x < t; x++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            char[][] box = new char[row][col];
            int candy = 0; // 사탕 수

            // 박스 초기화
            for (int i = 0; i < row; i++) {
                String s = sc.next();
                for (int j = 0; j < col; j++) {
                    box[i][j] = s.charAt(j);
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(box[i][j] == '>' && j <= col - 3) {
                        if(box[i][j+1] == 'o' && box[i][j+2] == '<') {
                            candy++;
                        }
                    } else if(box[i][j] == 'v' && i <= row - 3) {
                        if(box[i+1][j] == 'o' && box[i+2][j] == '^') {
                            candy++;
                        }
                    }
                }
            }

            System.out.println(candy);

        }
    }
}
