package leetcode.medium.no1344;

class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = hour * 30 + minutes / 2.0;
        double minuteAngle = minutes * 6;
        double angle = Math.max(hourAngle, minuteAngle) - Math.min(hourAngle, minuteAngle);
        if(angle > 180) angle = 360 - angle;
        return angle;
    }
}
