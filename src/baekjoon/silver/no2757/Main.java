package baekjoon.silver.no2757;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<String> result = new ArrayList<>();

        String line = br.readLine();
        while(!line.equals("R0C0")) {
            line = line.replace("R", "");
            String[] rc = line.split("C");
            int row = Integer.parseInt(rc[0]);
            int col = Integer.parseInt(rc[1]);

            result.add(getColName(col) + row);

            line = br.readLine();
        }

        for(String s : result) bw.write(s+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static String getColName(int col) {
        String colName = "";
        while(col > 0) {
            int index = (col - 1) % 26;
            char digit = (char)(index + 'A');
            colName = digit + colName;
            col = (col - 1) / 26;
        }
        return colName;
    }
}
