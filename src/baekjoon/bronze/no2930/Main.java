package baekjoon.bronze.no2930;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int round = sc.nextInt();

        String myRPS = sc.next();

        int n = sc.nextInt();
        String[] friendsRPS = new String[n];
        for (int i = 0; i < n; i++) {
            friendsRPS[i] = sc.next();
        }

        int score = 0;
        int maxScore = 0;

        for (int i = 0; i < round; i++) {
            char rps = myRPS.charAt(i);
            int rScore = 0;
            int pScore = 0;
            int sScore = 0;

            // 모든 친구와 대결
            for (String f : friendsRPS) {
                char fRps = f.charAt(i);
                score += game(rps, fRps);
                rScore += game('R', fRps);
                pScore += game('P', fRps);
                sScore += game('S', fRps);
            }

            // 한 라운드가 끝났을 때 제일 높은 모양 선택
            maxScore += Math.max(rScore, Math.max(pScore, sScore));
        }

        System.out.println(score);
        System.out.println(maxScore);

    }

    // 가위바위보
    public static int game(char a, char b) {
        // 무승부
        if (a == b) return 1;
        // 승리조건
        boolean s1 = (a == 'S' && b == 'P');
        boolean s2 = (a == 'R' && b == 'S');
        boolean s3 = (a == 'P' && b == 'R');
        // 승리
        if (s1 || s2 || s3) return 2;
        // 패배
        return 0;
    }
}
