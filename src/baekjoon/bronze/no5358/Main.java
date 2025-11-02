package baekjoon.bronze.no5358;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        while(sc.hasNext()) {
            String name = sc.nextLine();
            String correct = "";
            for(int i = 0; i < name.length(); i++) {
                if(name.charAt(i) == 'i') correct += "e";
                else if(name.charAt(i) == 'e') correct += "i";
                else if(name.charAt(i) == 'I') correct += "E";
                else if(name.charAt(i) == 'E') correct += "I";
                else correct += name.charAt(i);
            }
            result.add(correct);
        }

        for(String name : result) System.out.println(name);
    }
}
