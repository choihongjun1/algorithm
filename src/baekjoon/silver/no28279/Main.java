package baekjoon.silver.no28279;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String line = br.readLine();

            if(line.charAt(0) == '1') {
                deque.offerFirst(Integer.parseInt(line.substring(2)));
            } else if(line.charAt(0) == '2') {
                deque.offerLast(Integer.parseInt(line.substring(2)));
            } else if(line.equals("3")) {
                if(!deque.isEmpty()) result.add(deque.pollFirst());
                else result.add(-1);
            } else if(line.equals("4")) {
                if(!deque.isEmpty()) result.add(deque.pollLast());
                else result.add(-1);
            } else if(line.equals("5")) {
                result.add(deque.size());
            } else if(line.equals("6")) {
                if(deque.isEmpty()) result.add(1);
                else result.add(0);
            } else if(line.equals("7")) {
                if(!deque.isEmpty()) result.add(deque.peekFirst());
                else result.add(-1);
            } else if(line.equals("8")) {
                if(!deque.isEmpty()) result.add(deque.peekLast());
                else result.add(-1);
            }
        }

        for(int i : result) bw.write(i + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
