package leetcode.easy.no661;

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] smoothed = new int[img.length][img[0].length];
        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[0].length; j++) {
                int neighbour = 9;
                for(int k = -1; k <= 1; k++) {
                    for(int l = -1; l <= 1; l++) {
                        boolean row = i+k >= 0 && i+k < img.length;
                        boolean col = j+l >= 0 && j+l < img[0].length;
                        if(row && col) smoothed[i][j] += img[i+k][j+l];
                        else neighbour--;
                    }
                }
                smoothed[i][j] /= neighbour;
            }
        }
        return smoothed;
    }
}
