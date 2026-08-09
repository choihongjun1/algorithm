package leetcode.medium.no394;

class Solution {
    int index = 0;

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int k = 0;

        while (index < s.length()) {
            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
                index++;
            } else if (ch == '[') {
                index++;

                String nestedString = decodeString(s);

                for (int i = 0; i < k; i++) {
                    result.append(nestedString);
                }
                k = 0;
            } else if (ch == ']') {
                index++;
                return result.toString();
            } else {
                result.append(ch);
                index++;
            }
        }

        return result.toString();
    }
}
