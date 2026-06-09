package leetcode.easy.no1417;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String reformat(String s) {
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') q1.add(c);
            else q2.add(c);
        }

        if(Math.abs(q1.size() - q2.size()) > 1) return "";

        StringBuilder sb = new StringBuilder();
        while(!q1.isEmpty() && !q2.isEmpty()) {
            sb.append(q1.poll());
            sb.append(q2.poll());
        }

        if(!q1.isEmpty()) sb.append(q1.poll());
        else if(!q2.isEmpty()) sb.reverse().append(q2.poll());
        return sb.toString();
    }
}
