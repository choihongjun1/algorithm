package leetcode.medium.no537;

class Solution {
    public class Complex {
        int real;
        int imag;
    }

    public String complexNumberMultiply(String num1, String num2) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        String[] s1 = num1.split("\\+");
        String[] s2 = num2.split("\\+");

        c1.real = Integer.parseInt(s1[0]);
        c2.real = Integer.parseInt(s2[0]);
        c1.imag = Integer.parseInt(s1[1].substring(0, s1[1].length()-1));
        c2.imag = Integer.parseInt(s2[1].substring(0, s2[1].length()-1));

        Complex mul = complexMultiply(c1, c2);
        return mul.real + "+" + mul.imag + "i";
    }

    public Complex complexMultiply(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real * c2.real - c1.imag * c2.imag;
        result.imag = c1.real * c2.imag + c2.real * c1.imag;
        return result;
    }
}
