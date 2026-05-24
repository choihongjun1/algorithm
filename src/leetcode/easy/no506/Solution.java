package leetcode.easy.no506;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] rank = new String[score.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        int[] temp = new int[score.length];
        mergeSort(score, temp, 0, score.length-1);

        for(int i = 0; i < score.length; i++) {
            int index = map.get(score[i]);
            if(i == 0) rank[index] = "Gold Medal";
            else if(i == 1) rank[index] = "Silver Medal";
            else if(i == 2) rank[index] = "Bronze Medal";
            else rank[index] = String.valueOf(i+1);
        }

        return rank;
    }

    public void mergeSort(int[] arr, int[] temp, int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid+1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    public void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else {
                temp[k++] = arr[j];
                j++;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i];
            i++;
        }

        while (j <= right) {
            temp[k++] = arr[j];
            j++;
        }

        for (int idx = left; idx <= right; idx++) {
            arr[idx] = temp[idx];
        }
    }
}
