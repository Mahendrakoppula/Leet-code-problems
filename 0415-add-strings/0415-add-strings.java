import java.math.BigInteger;
class Solution {
    // public String addStrings(String num1, String num3) {
        
//         BigInteger n1= new BigInteger(num1);
//         BigInteger n3 = new BigInteger(num3);
//         BigInteger sum= n1.add(n3);
//        // int sum=n1+n3;
//         String result=sum.toString();
        
//         return result;
    public String addStrings(String num1, String num2) {
    int i = num1.length() - 1, j = num2.length() - 1;
    int carry = 0;
    StringBuilder sb = new StringBuilder();
    while (i >= 0 || j >= 0 || carry > 0) {
        int x = i >= 0 ? num1.charAt(i--) - '0' : 0;
        int y = j >= 0 ? num2.charAt(j--) - '0' : 0;
        int sum = x + y + carry;
        carry = sum / 10;
        sum = sum % 10;
        sb.append(sum);
    }
    return sb.reverse().toString();
}

    }