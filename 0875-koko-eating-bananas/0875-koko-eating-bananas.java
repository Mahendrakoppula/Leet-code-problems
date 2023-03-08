class Solution {
    public int minEatingSpeed(int[] piles, int h) {
//         int lo=1;
//          int max=Integer.MIN_VALUE;
        
        
        
//         for(int val: piles){
//             max=Math.max(val,max);
//         }
        
//         if(h==piles.length){
//             return max;
//         }
        
//         int speed=Integer.MAX_VALUE;
//        int hi=max;
//         while(lo<=hi){
//             int sp=lo+(hi-lo)/2;
            
//             if(isPossible(piles,sp,h)==true){
//                 speed=sp;
//                 hi=sp-1;
//             }
//             else{
//                 lo=sp+1;
//             }
//         }
//         return speed;
//     }
//     public boolean isPossible(int[] piles,int sp,int h){
//         int time=0;
        
//         // for(int i=0;i<piles.length;i++){
//         //     time+=(int)Math.ceil(piles[i]*1.0/sp);
//         // }
//          for(int pile : piles){
//             int div = pile / sp;
//             h += div;
//             if(pile % sp != 0) h++;
//         }
//         return time<=h;
        
//          int left = 1;
//         int right = 1000000000;
        
//         while(left <= right){
//             int mid = left + (right - left) / 2;
//             if(canEatInTime(piles, mid, h)) right = mid - 1;
//             else left = mid + 1;
//         }
//         return left;
//     }
//     public boolean canEatInTime(int piles[], int k, int h){
//         int hours = 0;
//         for(int pile : piles){
//             int div = pile / k;
//             hours += div;
//             if(pile % k != 0) hours++;
//         }
//         return hours <= h;
        
        
        int l = 1;
        int r = piles[0];
        for(int i = 0;i<piles.length;i++){
            r=Math.max(r,piles[i]);
        }
        
        int m;        
        int ans = -1;
        while(l<=r){
            m = (l+r)/2; 
            if(check(piles, h,m)){
                r = m-1;
                ans = m;
            }else{
                l = m+1;
            }
        }
        return ans;
    }

    public boolean check(int[] piles, int h, int k){
        if(k ==0)return false;
        int i = 0;
        while(h>=0 && i<piles.length){

            h -=Math.ceil((double)piles[i]/k);
            i++;
        }
        return (h>=0 && i == piles.length);

    }
}