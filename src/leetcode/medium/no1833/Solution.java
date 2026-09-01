package leetcode.medium.no1833;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] count = new int[100001];
        for(int cost : costs) {
            count[cost]++;
        }

        int iceCream = 0;
        for(int i = 1; i < count.length; i++) {
            if(count[i] == 0) continue;

            if(coins >= count[i] * i) {
                iceCream += count[i];
                coins -= count[i] * i;
            } else if(coins >= i) {
                iceCream += coins / i;
                coins -= coins / i * i;
            } else {
                break;
            }
        }

        return iceCream;
    }
}
