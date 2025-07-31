package alkon.week2.no32625;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(); // 배열 길이
        // 배열 초기화
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            if(n % i == 0) { // 동일 개수로 나눌 수 있음
                int[] subArr = new int[i]; // 분할 하나의 길이는 i
                int count = 0; // 분할 개수 카운트
                int sum = 0; // 분할의 최대최소 합
                for(int j = 0; j < n/i; j++) { // 분할 개수만큼 반복
                    // 분할 초기화
                    for(int k = 0; k < subArr.length; k++) {
                        subArr[k] = arr[count + k];
                    }
                    if(count == 0) sum = findSum(subArr);
                    if(sum != findSum(subArr)) break; // 합이 다르면 다음 i로 넘어가기
                    sum = findSum(subArr);
                    count += i;
                }
                // 모든 분할 합이 같음
                if(count == n) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
    }

    // 분할 최대최소 합 구하기
    public static int findSum(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i] < min){
                min = arr[i];
            }
        }

        return max + min;
    }
}
