package baekjoon.silver.no1003;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int zero = 0;
    static int one = 0;
    static int[] zeroArr = new int[41];
    static int[] oneArr = new int[41];

    public static void main(String[] args) {
        int test = sc.nextInt();
        int[] zeroCount = new int[test];
        int[] oneCount = new int[test];
        zeroArr[0] = 1;
        oneArr[1] = 1;
        for(int i = 0; i < test; i++) {
            fibo(sc.nextInt());
            zeroCount[i] = zero;
            oneCount[i] = one;
            zero = 0;
            one = 0;
        }
        for(int i = 0; i < test; i++) {
            System.out.println(zeroCount[i] + " " + oneCount[i]);
        }
    }

    public static void fibo(int n) {
        if(n == 0) {
            zero++;
        }
        else if(n == 1) {
            one++;
        }
        else {
            if(zeroArr[n] == 0) {
                fibo(n-1);
                fibo(n-2);
                zeroArr[n] = zero;
                oneArr[n] = one;
            } else {
                zero += zeroArr[n];
                one += oneArr[n];
            }
        }
    }
}
