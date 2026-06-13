package leetcode.easy.no1108;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
