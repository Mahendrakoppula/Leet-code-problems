class Solution {
    public int minEatingSpeed(int[] piles, int h) {
   int lo=1;
        int max=0;
        
        for(int val: piles){
            max=Math.max(val,max);
        }
        
       int hi=max;
        
        if(max==piles.length){
            return max;
        }
        
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(BananasCanBeEaten(piles,h,mid)){
            
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        return lo;
    }
        
        public boolean BananasCanBeEaten(int[] piles,int h,int mid){
            int k=0;
            for(int val: piles){
                k+=Math.ceil(1.0*val/mid);
            }
            return k<=h;
        }
}