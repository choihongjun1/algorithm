package leetcode.easy.no1886;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        return equal(mat, target, 0) || equal(mat, target, 90) || equal(mat, target, 180) || equal(mat, target, 270);
    }

    public boolean equal(int[][] mat, int[][] target, int degree) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                switch(degree) {
                    case 0:
                        if(mat[i][j] != target[i][j]) return false;
                        break;
                    case 90:
                        if(mat[i][j] != target[j][target.length-1-i]) return false;
                        break;
                    case 180:
                        if(mat[i][j] != target[target.length-1-i][target.length-1-j]) return false;
                        break;
                    case 270:
                        if(mat[i][j] != target[target.length-1-j][i]) return false;
                        break;
                }
            }
        }
        return true;
    }
}
