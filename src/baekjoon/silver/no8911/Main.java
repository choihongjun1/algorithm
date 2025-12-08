package baekjoon.silver.no8911;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[t];
        for(int i = 0; i < t; i++) {
            String instruction = br.readLine();
            result[i] = getArea(instruction);
        }

        for(int i : result) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int getArea(String instruction) {
        int x = 0;
        int y = 0;
        int xMin = 0;
        int xMax = 0;
        int yMin = 0;
        int yMax = 0;
        int direction = 0;

        for(int i = 0; i < instruction.length(); i++) {
            char c = instruction.charAt(i);

            if(c == 'L') {
                direction += 1;
                direction %= 4;
            } else if(c == 'R') {
                direction += 3;
                direction %= 4;
            } else if((c == 'F' && direction == 0) || (c == 'B' && direction == 2)) {
                y++;
                if(y > yMax) yMax = y;
            } else if ((c == 'F' && direction == 1) || (c == 'B' && direction == 3)) {
                x--;
                if(x < xMin) xMin = x;
            } else if((c == 'F' && direction == 2) || (c == 'B' && direction == 0)) {
                y--;
                if(y < yMin) yMin = y;
            } else if((c == 'F' && direction == 3) || (c == 'B' && direction == 1)) {
                x++;
                if(x > xMax) xMax = x;
            }
        }

        return (xMax - xMin) * (yMax - yMin);
    }
}
