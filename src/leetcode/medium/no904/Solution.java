package leetcode.medium.no904;

class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int l = 0;
        int type = 0;
        int[] count = new int[fruits.length];

        for(int r = 0; r < fruits.length; r++) {
            count[fruits[r]]++;
            if(count[fruits[r]] == 1) {
                type++;
            }

            while(type > 2) {
                count[fruits[l]]--;
                if(count[fruits[l]] == 0) type--;
                l++;
            }

            max = Math.max(max, r-l+1);
        }

        return max;
    }
}
