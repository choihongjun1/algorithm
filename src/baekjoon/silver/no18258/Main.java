package baekjoon.silver.no18258;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            if(line.contains("push")) {
                deque.offerLast(Integer.parseInt(line.substring(5)));
            } else if(line.equals("pop")) {
                if(!deque.isEmpty()) {
                    result.add(deque.pollFirst());
                } else {
                    result.add(-1);
                }
            } else if(line.equals("size")) {
                result.add(deque.size());
            } else if(line.equals("empty")) {
                if(deque.isEmpty()) {
                    result.add(1);
                } else {
                    result.add(0);
                }
            } else if(line.equals("front")) {
                if(!deque.isEmpty()) {
                    result.add(deque.peekFirst());
                } else {
                    result.add(-1);
                }
            } else if(line.equals("back")) {
                if(!deque.isEmpty()) {
                    result.add(deque.peekLast());
                } else {
                    result.add(-1);
                }
            }
        }

        for(int i : result) bw.write(i + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
