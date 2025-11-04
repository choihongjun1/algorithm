package baekjoon.silver.no11536;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        String[] sort = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            sort[i] = arr[i];
        }
        Arrays.sort(sort);

        boolean incFlag = true;
        boolean decFlag = true;
        for(int i = 0; i < n; i++) {
            if(!arr[i].equals(sort[i])) {
                incFlag = false;
            }
            if(!arr[i].equals(sort[sort.length-1-i])) {
                decFlag = false;
            }
            if(!incFlag && !decFlag) {
                bw.write("NEITHER\n");
                break;
            }
        }

        if(incFlag) {
            bw.write("INCREASING\n");
        } else if(decFlag) {
            bw.write("DECREASING\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
