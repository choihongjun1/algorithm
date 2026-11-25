package biko.no4901;

import java.io.*;
import java.util.*;

public class Main {
    static final long INF = Long.MAX_VALUE / 4;

    static int N, Q;
    static int[] A;
    static long[] L, R;

    static int lowerBound(int x) {
        int low = 1;
        int high = N + 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (A[mid] < x)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        A = new int[N + 1];
        L = new long[N + 1];
        R = new long[N + 2];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A, 1, N + 1);

        Arrays.fill(L, INF);
        Arrays.fill(R, INF);

        L[0] = 0;
        R[N + 1] = 0;

        // 정방향
        for (int i = 1; i <= N; i++) {
            for (int k = 3; k <= 5; k++) {
                if (i - k < 0)
                    continue;

                long cost = 2L * (A[i] - A[i - k + 1]);
                L[i] = Math.min(L[i], L[i - k] + cost);
            }
        }

        // 역방향
        for (int i = N; i >= 1; i--) {
            for (int k = 3; k <= 5; k++) {
                if (i + k - 1 > N)
                    continue;

                long cost = 2L * (A[i + k - 1] - A[i]);
                R[i] = Math.min(R[i], R[i + k] + cost);
            }
        }

        StringBuilder sb = new StringBuilder();

        // 5. 쿼리 처리
        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            // 초청 선수보다 왼쪽에 있는 선수의 수
            int p = lowerBound(X) - 1;
            long answer = INF;

            for (int size = 3; size <= 5; size++) {
                for (int l = 0; l < size; l++) {
                    int r = size - l - 1;

                    if (p - l < 0 || p + r > N)
                        continue;

                    int min = (l == 0) ? X : A[p - l + 1];
                    int max = (r == 0) ? X : A[p + r];
                    long cost = L[p - l] + 2L * (max - min) + R[p + r + 1];

                    answer = Math.min(answer, cost);
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
