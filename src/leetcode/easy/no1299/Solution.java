package leetcode.easy.no1299;

class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[result.length-1] = -1;
        int max = 0;
        for(int i = arr.length-1; i > 0; i--) {
            if(arr[i] > max) max = arr[i];
            result[i-1] = max;
        }
        return result;
    }
}
