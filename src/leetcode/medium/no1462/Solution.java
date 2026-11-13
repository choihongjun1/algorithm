package leetcode.medium.no1462;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int[][] d = new int[numCourses][numCourses];
        for(int i = 0; i < numCourses; i++) {
            Arrays.fill(d[i], numCourses);
            d[i][i] = 0;
        }

        for(int[] prerequisite : prerequisites) {
            d[prerequisite[0]][prerequisite[1]] = 1;
        }

        for(int k = 0; k < numCourses; k++) {
            for(int i = 0; i < numCourses; i++) {
                for(int j = 0; j < numCourses; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        List<Boolean> list = new ArrayList<>();
        for(int[] query : queries) {
            list.add(d[query[0]][query[1]] != numCourses);
        }

        return list;
    }
}
