package leetcode.easy.no2389;

import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int n = nums.length;
        int m = queries.length;
        int[] answer = new int[m];

        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        for (int i = 0; i < m; i++) {
            int query = queries[i];
            int left = 0, right = n - 1;
            int count = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (prefixSum[mid] <= query) {
                    count = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}
