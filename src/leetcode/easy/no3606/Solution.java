package leetcode.easy.no3606;

import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> electronics = new ArrayList<>();
        List<String> grocery = new ArrayList<>();
        List<String> pharmacy = new ArrayList<>();
        List<String> restaurant = new ArrayList<>();

        for(int i = 0; i < code.length; i++){
            if(!isActive[i]) continue;
            if(!isValidCode(code[i])) continue;

            if(businessLine[i].equals("electronics")) electronics.add(code[i]);
            else if(businessLine[i].equals("grocery")) grocery.add(code[i]);
            else if(businessLine[i].equals("pharmacy")) pharmacy.add(code[i]);
            else if(businessLine[i].equals("restaurant")) restaurant.add(code[i]);
        }

        Collections.sort(electronics);
        Collections.sort(grocery);
        Collections.sort(pharmacy);
        Collections.sort(restaurant);

        List<String> result = new ArrayList<>();
        result.addAll(electronics);
        result.addAll(grocery);
        result.addAll(pharmacy);
        result.addAll(restaurant);
        return result;
    }

    public boolean isValidCode(String code) {
        if(code.isEmpty()) return false;
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) >= 'a' && code.charAt(i) <= 'z') continue;
            if(code.charAt(i) >= 'A' && code.charAt(i) <= 'Z') continue;
            if(code.charAt(i) >= '0' && code.charAt(i) <= '9') continue;
            if(code.charAt(i) == '_') continue;
            return false;
        }
        return true;
    }
}
