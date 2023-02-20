/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // for(int i=0;i<n;i++){
        //     if(isBadVersion(i)){
        //         return i;
        //     }
        // }
        // return n;
        
        int low = 1;
    int high = n;
    
    while (low < high) {
        int mid = low + (high - low) / 2;
        
        if (isBadVersion(mid)) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    
    return low;
    }
}