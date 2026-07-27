package leetcode.medium.no1093;

class Solution {
    public double[] sampleStats(int[] count) {
        double sum = 0;
        int mode = 0;
        int max = 0;
        int min = 255;
        long[] countSum = new long[count.length];
        for(int i = 0; i < count.length; i++) {
            sum += (double)i * count[i];
            if(i > 0) countSum[i] = countSum[i-1] + count[i];
            else countSum[i] = count[0];
            if(count[mode] < count[i]) mode = i;
            if(count[i] > 0 && i < min) min = i;
            if(count[i] > 0 && i > max) max = i;
        }

        long n = countSum[countSum.length-1];
        double mean = sum / n;

        double median = 0;
        while(n / 2.0 > countSum[(int)median]) {
            median++;
        }
        if(n % 2 == 0) {
            if(n / 2 == countSum[(int)median]) {
                int r = (int)median + 1;
                while(r < countSum.length && count[r] == 0) r++;
                if(r < countSum.length) median = (median + r) / 2.0;
            }
        }

        return new double[]{min, max, mean, median, mode};
    }
}
