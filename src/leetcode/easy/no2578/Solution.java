package leetcode.easy.no2578;

class Solution {
    public int splitNum(int num) {
        int[] count = new int[10];
        while(num > 0) {
            count[num % 10]++;
            num /= 10;
        }

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for(int i = 0; i <= 9; i++) {
            for(int j = 0; j < count[i]; j++) {
                if(num1.length() == num2.length()) num1.append(i);
                else num2.append(i);
            }
        }

        return Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());
    }
}
