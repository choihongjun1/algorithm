package baekjoon.silver.no12278;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, BigInteger> indexMap = new HashMap<>();
    static Map<BigInteger, String> elementMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        indexMap.put("1 1", BigInteger.ONE);
        elementMap.put(BigInteger.ONE, "1 1");

        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            if(id == 1) {
                BigInteger n = new BigInteger(st.nextToken());
                bw.write("Case #" + i + ": " + getElement(n) + "\n");
            }
            else {
                BigInteger p = new BigInteger(st.nextToken());
                BigInteger q = new BigInteger(st.nextToken());
                bw.write("Case #" + i + ": " + getIndex(p, q) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static BigInteger getIndex(BigInteger p, BigInteger q) {
        String key = p + " " + q;
        if(indexMap.get(key) != null) return indexMap.get(key);

        BigInteger n = (p.compareTo(q) < 0) ? getIndex(p, q.subtract(p)).multiply(BigInteger.TWO) : getIndex(p.subtract(q), q).multiply(BigInteger.TWO).add(BigInteger.ONE);
        indexMap.put(key, n);
        elementMap.put(n, key);
        return indexMap.get(key);
    }

    public static String getElement(BigInteger n) {
        if(elementMap.get(n) != null) return elementMap.get(n);

        String parent = getElement(n.divide(BigInteger.TWO));
        BigInteger p = new BigInteger(parent.split(" ")[0]);
        BigInteger q = new BigInteger(parent.split(" ")[1]);

        String key = (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) ? p + " " + (p.add(q)) : (p.add(q)) + " " + q;
        elementMap.put(n, key);
        indexMap.put(key, n);
        return elementMap.get(n);
    }
}
