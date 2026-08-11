package leetcode.medium.no781;

class Solution {
    public int numRabbits(int[] answers) {
        int[] count = new int[1001];
        for(int i = 0; i < answers.length; i++) {
            count[answers[i]]++;
        }

        int rabbit = 0;
        for(int i = 0; i < count.length; i++) {
            int mod = count[i] % (i+1);
            rabbit += count[i] - mod;
            if(mod > 0) rabbit += i+1;
        }

        return rabbit;
    }
}
