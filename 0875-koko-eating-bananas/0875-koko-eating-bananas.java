class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
                int max = Integer.MIN_VALUE;
        for (int pile : piles) max = Math.max(max, pile);

        int low = 1, high = max;

        int hi=max;
        if(h==piles.length){
            return max;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canEatAllBananasWithSpeedK(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canEatAllBananasWithSpeedK(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil(1.0 * pile / k);
        }
        return hours <= h;

        
//          int low = 1;
//         int high = Arrays.stream(piles).max().getAsInt();
//         int mid = 0;
//       int hours = 0;
        
//         while (low <= high) {
//             mid = (low + high) / 2;
//             hours = 0;
//             for (int pile : piles) {
//                 hours += Math.ceil((double) pile / mid);
//                 if(hours > h){break;}
//             }
//             if (hours > h) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
        
//         return low;
        
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
//         for(int i=0;i<piles.length;i++){
//             time+=(int)Math.ceil(piles[i]*1.0/sp);
//         }
//         return time<=h;
        
    }
}