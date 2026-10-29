package leetcode.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int day = 0;
        for(int i = 0; i < courses.length; i++) {
            int duration = courses[i][0];
            int deadline = courses[i][1];
            maxHeap.offer(duration);
            day += duration;
            if(day > deadline) {
                day -= maxHeap.poll();
            }
        }

        return maxHeap.size();
    }
}
