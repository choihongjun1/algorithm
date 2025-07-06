package baekjoon.no17488;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int studentCount = sc.nextInt(); // 학생 수
        int subjectCount = sc.nextInt(); // 과목 수

        int[] subjectLimit = new int[subjectCount]; // 과목 제한인원
        for(int i = 0; i < subjectCount; i++) {
            subjectLimit[i] = sc.nextInt();
        }

        // 과목별 리스트 초기화
        List<List<Integer>> subjectList = new ArrayList<>(subjectCount);
        for(int i = 0; i < subjectCount; i++) {
            subjectList.add(new ArrayList<>());
        }

        // 학생별 리스트 초기화
        List<List<Integer>> studentList = new ArrayList<>(studentCount);
        for(int i = 0; i < studentCount; i++) {
            studentList.add(new ArrayList<>());
        }

        int[] subjectListSize = new int[subjectCount]; // 1차 수강바구니 후 성공한 학생 수

        // 1차 수강바구니
        register(subjectList, studentCount);
        save(subjectList, subjectListSize, subjectCount, subjectLimit, studentList);

        for(int i = 0; i < subjectCount; i++) {
            subjectListSize[i] = subjectList.get(i).size();
        }

        // 2차 수강바구니
        register(subjectList, studentCount);
        save(subjectList, subjectListSize, subjectCount, subjectLimit, studentList);

        // 학생별 성공 과목 출력
        result(studentList, studentCount);

    }

    // 수강바구니
    public static void register(List<List<Integer>> subjectList, int studentCount) {
        int studentNumber = 1;
        while(studentNumber <= studentCount) {
            int subjectNumber = sc.nextInt();
            if(subjectNumber != -1) {
                subjectList.get(subjectNumber-1).add(studentNumber); // 신청 과목 리스트에 학번 추가
            } else {
                studentNumber++;
            }
        }
    }

    // 학생별 큐에 성공 과목 추가
    public static void save(List<List<Integer>> subjectList, int[] subjectListSize, int subjectCount, int[] subjectLimit, List<List<Integer>> studentList) {
        for(int i = 0; i < subjectCount; i++) {
            if(subjectList.get(i).size() <= subjectLimit[i]) {
                for(int j = subjectListSize[i]; j < subjectList.get(i).size(); j++) {
                    int stdNum = subjectList.get(i).get(j);
                    studentList.get(stdNum-1).add(i+1);
                }
            }
        }
    }

    // 학생별 성공 과목 출력
    public static void result(List<List<Integer>> studentList, int studentCount) {
        for(int i = 0; i < studentCount; i++) {
            String result = "";
            if(!studentList.get(i).isEmpty()) {
                sort(studentList.get(i));
                for(int j = 0; j < studentList.get(i).size(); j++) {
                    result += studentList.get(i).get(j);
                    if(!studentList.get(i).isEmpty()) {
                        result += " ";
                    }
                }
            } else {
                result = "망했어요";
            }
            System.out.println(result);
        }
    }
}