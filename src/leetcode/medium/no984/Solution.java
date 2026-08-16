package leetcode.medium.no984;

class Solution {
    public String strWithout3a3b(int a, int b) {
        if(a == b) return "ab".repeat(a);

        String large = a > b ? "a" : "b";
        String small = a < b ? "a" : "b";

        if(Math.min(a,b) * 2 < Math.max(a,b)) {
            return (large + large + small).repeat(Math.min(a,b)) + large.repeat(Math.max(a,b) - 2 * Math.min(a,b));
        } else {
            return (large + large + small).repeat(Math.abs(a-b)) + (large + small).repeat(Math.min(a,b) - Math.abs(a-b));
        }
    }
}
