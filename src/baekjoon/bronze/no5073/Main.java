package baekjoon.bronze.no5073;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<String> result = new ArrayList<>();

        String line = br.readLine();
        while(!line.equals("0 0 0")) {
            String[] num = line.split(" ");
            int[] side = new int[num.length];
            side[0] = Integer.parseInt(num[0]);
            side[1] = Integer.parseInt(num[1]);
            side[2] = Integer.parseInt(num[2]);

            int max = 0;
            int maxIndex = 0;
            for(int i = 0; i < num.length; i++) {
                if(max < side[i]) max = side[i];
                maxIndex = i;
            }
            int sum = 0;
            for(int i = 0; i < side.length; i++) {
                if(i != maxIndex) sum += side[i];
            }

            if(max < sum) {
                if(side[0] == side[1] && side[0]== side[2]) result.add("Equilateral");
                else if(side[0] == side[1] || side[0] == side[2] || side[1] == side[2]) result.add("Isosceles");
                else result.add("Scalene");
            } else {
                result.add( "Invalid");
            }

            line = br.readLine();
        }

        for(String s : result) bw.write(s+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
