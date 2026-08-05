package leetcode.easy.no925;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()) return false;

        int nameIndex = 0;
        int typedIndex = 0;
        int len1;
        int len2;

        while(true) {
            String[] s1 = getContiguousString(name, nameIndex);
            String[] s2 = getContiguousString(typed, typedIndex);

            if(s1 == null && s2 == null) return true;
            else if(s1 == null || s2 == null) return false;

            len1 = Integer.parseInt(s1[1]);
            len2 = Integer.parseInt(s2[1]);

            if(len1 > len2) return false;
            if(!s1[0].equals(s2[0])) return false;

            nameIndex += len1;
            typedIndex += len2;
        }

    }

    public String[] getContiguousString(String str, int index) {
        if(index >= str.length()) return null;

        String[] result = new String[2];
        char c = str.charAt(index);
        int len = 1;
        for(int i = index+1; i < str.length(); i++) {
            if(c != str.charAt(i)) break;
            len++;
        }

        result[0] = String.valueOf(c);
        result[1] = String.valueOf(len);

        return result;
    }
}
