package leetcode.easy.no13;

class Solution {
    public int romanToInt(String s) {
        int num = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
                num += 1;
            } else if(s.charAt(i) == 'V') {
                if(i > 0 && s.charAt(i-1) == 'I') {
                    num -= 1;
                    num += 4;
                } else {
                    num += 5;
                }
            } else if(s.charAt(i) == 'X') {
                if(i > 0 && s.charAt(i-1) == 'I') {
                    num -= 1;
                    num += 9;
                } else {
                    num += 10;
                }
            } else if(s.charAt(i) == 'L') {
                if(i > 0 && s.charAt(i-1) == 'X') {
                    num -= 10;
                    num += 40;
                } else {
                    num += 50;
                }
            } else if(s.charAt(i) == 'C') {
                if(i > 0 && s.charAt(i-1) == 'X') {
                    num -= 10;
                    num += 90;
                } else {
                    num += 100;
                }
            } else if(s.charAt(i) == 'D') {
                if(i > 0 && s.charAt(i-1) == 'C') {
                    num -= 100;
                    num += 400;
                } else {
                    num += 500;
                }
            } else if(s.charAt(i) == 'M') {
                if(i > 0 && s.charAt(i-1) == 'C') {
                    num -= 100;
                    num += 900;
                } else {
                    num += 1000;
                }
            }
        }

        return num;
    }
}
