package leetcode.easy.no832;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flipped = new int[image.length][image[0].length];
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image.length; j++) {
                if(image[i][image.length-1 - j] == 0) flipped[i][j] = 1;
            }
        }
        return flipped;
    }
}
