package leetcode.easy.no67;

class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        String longer = a.length() >= b.length() ? a : b;
        for(int i = 0; i < Math.min(a.length(), b.length()); i++) {
            int ad = a.charAt(a.length()-1-i)-'0';
            int bd = b.charAt(b.length()-1-i)-'0';
            int sum = ad + bd + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        for(int i = Math.min(a.length(), b.length()); i < Math.max(a.length(), b.length()); i++) {
            int d = longer.charAt(longer.length()-1-i)-'0';
            int sum = d + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry != 0) sb.append(carry);

        return sb.reverse().toString();
    }
}
