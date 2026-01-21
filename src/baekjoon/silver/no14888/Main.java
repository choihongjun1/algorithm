package baekjoon.silver.no14888;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int[] num;
    static char[] op, result;
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        num = new int[n];
        op = new char[n-1];
        result = new char[n-1];
        visited = new boolean[n-1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int index = 0;
        int plus = Integer.parseInt(st.nextToken());
        for(int i = 0; i < plus; i++) op[index++] = '+';
        int minus = Integer.parseInt(st.nextToken());
        for(int i = 0; i < minus; i++) op[index++] = '-';
        int mul = Integer.parseInt(st.nextToken());
        for(int i = 0; i < mul; i++) op[index++] = '*';
        int div = Integer.parseInt(st.nextToken());
        for(int i = 0; i < div; i++) op[index++] = '/';

        bt(0);

        bw.write(max + "\n" + min);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bt(int count) {
        if(count == n-1) {
            int cal = calculate();
            if(cal > max) max = cal;
            if(cal < min) min = cal;
            return;
        }

        char prev = ' ';
        for(int i = 0; i < n-1; i++) {
            if(visited[i]) continue;
            if(prev == op[i]) continue;
            visited[i] = true;
            prev = op[i];
            result[count] = op[i];
            bt(count + 1);
            visited[i] = false;
        }
    }

    public static int calculate() {
        int cal = num[0];
        for(int i = 0; i < n-1; i++) {
            if(result[i] == '+') cal += num[i+1];
            else if(result[i] == '-') cal -= num[i+1];
            else if(result[i] == '*') cal *= num[i+1];
            else if(result[i] == '/') cal /= num[i+1];
        }
        return cal;
    }
}
