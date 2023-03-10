class Solution {
    public boolean isHappy(int n) {
    // if (n == 1) {
    //     return true;
    // }
    
    // boolean[] visited=new boolean[1000];
    // int[] squares={0,1,4,9,16,25,36,49,64,81};


    // while(n!=1){
    //     int sum=0;
    //     while(n>0){
    //         int digit=n%10;
    //         sum+=squares[digit];
    //         n/=10;
    //     }
    //     if(visited[sum]){
    //         return false;
    //     }

    //     visited[sum]=true;
    //     n=sum;
    // }
    // return true;
    if(n==1){
            return true;
        }
        if(n>1 && n<=4){
            return false;
        }
         int res =0;
        while(n>0){
            int v = n%10;
            res+=(v*v);
            n=n/10;
        }
       
        return isHappy(res);
}
}