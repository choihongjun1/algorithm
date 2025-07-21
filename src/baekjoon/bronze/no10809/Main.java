package baekjoon.bronze.no10809;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();
        String result = "";
        char alphabet = 'a';
        for(int i = 0; i < 26; i++) {
            if(!word.contains(String.valueOf(alphabet))) result += "-1";
            else {
                for(int j = 0; j < word.length(); j++) {
                    if(word.charAt(j) == alphabet) {
                        result += j;
                        break;
                    }
                }
            }
            if(i != 25) result += " ";
            alphabet++;
        }

        System.out.println(result);
    }
}
