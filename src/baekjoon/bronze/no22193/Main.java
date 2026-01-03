package baekjoon.bronze.no22193;

import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        br.readLine();
        BigInteger num1 = new BigInteger(br.readLine());
        BigInteger num2 = new BigInteger(br.readLine());
        bw.write(num1.multiply(num2).toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
