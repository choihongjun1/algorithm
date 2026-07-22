package leetcode.easy.no459;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 2; i <= s.length(); i++) {
            if(isPrime(i) && s.length() % i == 0) {
                String sub = s.substring(0, s.length()/i);
                for(int j = 1; j < i; j++) {
                    String curr = s.substring(j * s.length()/i ,(j+1) * s.length()/i);
                    if(!sub.equals(curr)) break;
                    if(j == i-1) return true;
                }
            }
        }
        return false;
    }

    public boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
