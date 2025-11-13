package baekjoon.silver.no29812;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();
        int delete = sc.nextInt();
        int drag = sc.nextInt();

        int h = 0;
        int y = 0;
        int u = 0;
        String d = "";
        int energe = 0;
        for(int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c == 'H') {
                h++;
                if(!d.isEmpty()) {
                    energe += Math.min(d.length() * delete, drag + delete);
                    d = "";
                }
            }
            else if(c == 'Y') {
                y++;
                if(!d.isEmpty()) {
                    energe += Math.min(d.length() * delete, drag + delete);
                    d = "";
                }
            }
            else if(c == 'U') {
                u++;
                if(!d.isEmpty()) {
                    energe += Math.min(d.length() * delete, drag + delete);
                    d = "";
                }
            }
            else d += c;
        }
        if(!d.isEmpty()) {
            energe += Math.min(d.length() * delete, drag + delete);
            d = "";
        }


        if(energe == 0) {
            System.out.println("Nalmeok");
        } else {
            System.out.println(energe);
        }
        int min = Math.min(h, Math.min(y, u));
        if(min == 0) {
            System.out.println("I love HanYang University");
        } else {
            System.out.println(min);
        }
    }
}
