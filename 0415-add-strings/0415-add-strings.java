import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num3) {
        // in1=Integer.parseInt(num1);
        // int n3=Integer.parseInt(num3);
        BigInteger n1= new BigInteger(num1);
        BigInteger n3 = new BigInteger(num3);
        BigInteger sum= n1.add(n3);
       // int sum=n1+n3;
        String result=sum.toString();
        
        return result;
    }
}