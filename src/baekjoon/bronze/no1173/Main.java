package baekjoon.bronze.no1173;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int exerciseCount = 0;
        int minPulse = sc.nextInt();
        int maxPulse = sc.nextInt();
        int exercise = sc.nextInt();
        int rest = sc.nextInt();
        int pulse = minPulse;
        int time = 0;

        while(exerciseCount < n) {
            if(minPulse + exercise > maxPulse) {
                time = -1;
                break;
            }
            if(pulse + exercise <= maxPulse) {
                pulse += exercise;
                exerciseCount++;
            }
            else {
                pulse -= rest;
                if(pulse < minPulse) pulse = minPulse;
            }
            time++;
        }

        System.out.println(time);
    }
}
