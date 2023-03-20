class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    //     int count = 0;
    // for(int i=0; i<flowerbed.length && count<n; i++) {
    //     if(flowerbed[i] == 0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)) {
    //         flowerbed[i] = 1;
    //         count++;
    //     }
    // }
    // return count == n;
        
         int total = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            boolean isLeftPlotEmpty = (i == 0) || flowerbed[i-1] == 0;
            if (flowerbed[i] == 0) {
                boolean isRightPlotEmpty = (i == flowerbed.length-1) || flowerbed[i+1] == 0;
                if (isLeftPlotEmpty && isRightPlotEmpty) {
                    flowerbed[i] = 1;
                    total++;
                    if (total >= n) {
                        return true;
                    }
                }
            }
        }
        return total >= n;
    }
}