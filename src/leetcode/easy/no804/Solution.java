package leetcode.easy.no804;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()) {
                sb.append(morseCode[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
