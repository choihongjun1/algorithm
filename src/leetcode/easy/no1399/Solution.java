package leetcode.easy.no1399;

class Solution {
    public int countLargestGroup(int n) {
        int[] digitSum = new int[n + 1];
        int[] groupSizes = new int[37];

        int maxSize = 0;
        int maxGroupsCount = 0;

        for (int i = 1; i <= n; i++) {
            digitSum[i] = i % 10 + digitSum[i / 10];
            int sum = digitSum[i];

            groupSizes[sum]++;

            if (groupSizes[sum] > maxSize) {
                maxSize = groupSizes[sum];
                maxGroupsCount = 1;
            } else if (groupSizes[sum] == maxSize) {
                maxGroupsCount++;
            }
        }

        return maxGroupsCount;
    }
}