package baekjoon.bronze.no3040;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
        }

        // 아홉명 총합
        int sum = 0;
        for(int i : list) {
            sum += i;
        }

        for(int i = 0; i < list.size(); i++) {
            int index = list.indexOf(sum-100-list.get(i));
            if(index != -1 && index != i) {
                for(int j = 0; j < list.size(); j++) {
                    if(j != i && j != index) {
                        System.out.println(list.get(j));
                    }
                }
                return;
            }
        }
    }
}
