class Solution {
    public boolean isHappy(int n) {
        if(n==1 ){
            return true;
        }
         Set<Integer> st= new HashSet<>();
        while(n!=1){
            int sum=0;
            while(n>0){
                int digit= n%10;
                sum+=digit*digit;
                n/=10;
            }
            if(st.contains(sum)){
                return false;
            }
            else{
                st.add(sum);
                n=sum;
            }
        }
        return true;
        
    }
}