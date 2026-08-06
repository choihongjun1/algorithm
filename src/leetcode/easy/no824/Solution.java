package leetcode.easy.no824;

class Solution {
    public String toGoatLatin(String sentence) {
        String[] split = sentence.split(" ");
        for(int i = 0; i < split.length; i++) {
            char c = split[i].charAt(0);
            if("aieouAIEOU".contains(c+"")) {
                split[i] = split[i] + "ma" + "a".repeat(i+1);
            } else {
                split[i] = split[i].substring(1) + c + "ma" + "a".repeat(i+1);
            }
        }
        return String.join(" ", split);
    }
}
