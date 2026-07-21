package leetcode.medium.no7;

class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder reverse = new StringBuilder();

        if(x >= 0) {
            for(int i = s.length()-1; i >= 0; i--) {
                reverse.append(s.charAt(i));
            }

            String reversed = reverse.toString();
            if(reversed.length() == 10 && "2147483647".compareTo(reversed) < 0) {
                return 0;
            } else {
                return Integer.parseInt(reversed);
            }
        } else {
            for(int i = s.length()-1; i >= 1; i--) {
                reverse.append(s.charAt(i));
            }

            String reversed = reverse.toString();
            if(reversed.length() == 10 && "2147483648".compareTo(reversed) < 0) {
                return 0;
            } else {
                return -1 * Integer.parseInt(reversed);
            }
        }

    }
}