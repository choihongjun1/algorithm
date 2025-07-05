package alkon.no17488;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int studentCount = sc.nextInt(); // 학생 수
        int subjectCount = sc.nextInt(); // 과목 수

        int[] subjectLimit = new int[subjectCount]; // 과목 제한인원
        for (int i = 0; i < subjectLimit.length; i++) {
            subjectLimit[i] = sc.nextInt();
        }

        int[][] basket = new int[subjectCount][studentCount];
        int[][] students = new int[studentCount][subjectCount]; // 수강신청 내역 배열

        registration(basket, studentCount); // 수강바구니 1차
        saveResult(basket, students, subjectLimit);

        registration(basket, studentCount); // 수강바구니 2차
        saveResult(basket, students, subjectLimit);

        int[] successCount = new int[studentCount];
        for(int i = 0; i < students.length; i++) {
            for(int j = 0; j < students[i].length; j++) {
                if(students[i][j] != 0) {
                    successCount[i]++;
                }
            }
        }

        result(students, successCount);
    }

    private static void registration(int[][] basket,  int studentCount) {
        int studentNumber = 1;
        while(studentNumber <= studentCount) {
            int subjectNumber = sc.nextInt();
            if (subjectNumber != -1) {
                basket[subjectNumber-1][studentNumber-1] = studentNumber;
            } else {
                studentNumber++;
            }
        }
    }

    private static void saveResult(int[][] basket, int[][] students, int[] subjectLimit) {
        for (int i = 0; i < basket.length; i++) {
            int count = 0;
            for (int j = 0; j < basket[i].length; j++) {
                if(basket[i][j] != 0) {
                    count++;
                }
            }
            if(count <= subjectLimit[i]) {
                for(int j = 0; j < basket[i].length; j++) {
                    if(basket[i][j] != 0) {
                        students[j][i] = basket[i][j];
                    }
                }
            }
        }
    }

    private static void result(int[][] students, int[] successCount) {
        for(int i = 0; i < students.length; i++) {
            if (successCount[i] != 0) {
                int count = 0;
                for(int j = 0; j < students[i].length; j++) {
                    if(students[i][j] != 0) {
                        count++;
                        if (count != successCount[i]) {
                            System.out.print(j+1+" ");
                        } else {
                            System.out.println(j+1);
                        }
                    }
                }
            } else {
                System.out.println("망했어요");
            }
        }
    }
}

