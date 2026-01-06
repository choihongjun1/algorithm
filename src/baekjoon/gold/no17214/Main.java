package baekjoon.gold.no17214;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String p = br.readLine();

        boolean x = false;
        String a = "";
        String b = "";
        for(int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if(c == 'x') x = true;
            else if(x) b += c;
            else a += c;
        }

        if(!x) {
            int n = Integer.parseInt(a);
            String coef = "";
            if(n == 1) coef = "x";
            else if(n == -1) coef = "-x";
            else if(n != 0) coef = n + "x";

            if(n == 0) bw.write("W");
            else bw.write(coef + "+W");
        } else {
            int m = Integer.parseInt(a);
            int n = 0;
            if(!b.isEmpty()) n = Integer.parseInt(b);

            String inc = "";
            if(m/2 == -1) inc = "-";
            else if(m/2 > 1 || m/2 < -1) inc = String.valueOf(m/2);

            String coef = "";
            if(n == 1) coef = "+x";
            else if(n == -1) coef = "-x";
            else if(n > 0) coef = "+" + n + "x";
            else if(n < 0) coef = n + "x";

            bw.write(inc + "xx" + coef + "+W");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
