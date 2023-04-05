class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        //  int[] items = new int[numOnes+numZeros+numNegOnes];
        // int idx = 0;
        // for(int i=0; i<numOnes; i++) {
        //     items[idx++] = 1;
        // }
        // for(int i=0; i<numZeros; i++) {
        //     items[idx++] = 0;
        // }
        // for(int i=0; i<numNegOnes; i++) {
        //     items[idx++] = -1;
        // }
        // Arrays.sort(items);
        // int sum = 0;
        // for(int i=items.length-1; i>=items.length-k; i--) {
        //     sum += items[i];
        // }
        // return sum;
        
        
           int ans = 0;
    // if (numOnes <= k) 
    if (k>=numOnes){
        ans += numOnes;
        k -= numOnes;
    } else {
        ans += k;
        k = 0;
    }

    if (k == 0) {
        return ans;
    }

    if (numZeros <= k) {
        k -= numZeros;
    } else {
        k = 0;
    }

    if (k == 0) {
        return ans;
    }

    if (numNegOnes <= k) {
        ans -= numNegOnes;
    } else {
        ans -= k;
    }

    return ans;
        
//         int ans=0;
//         if(k<numOnes){
//             return k;
//         }else if(k>numOnes){
//             ans+=numOnes;
//             k-=numOnes;
            
//             if(k>numZeros){
//                 ans+=0;
//                 k-=numZeros;
//                 if(k<numNegOnes){
//                     ans-=k;
//                 }else if(k>=numNegOnes){
//                     ans-=k;
//                 }
//             }
//         }
//         return ans;
        // return Math.min(k,numOnes)-Math.max(0,k-numOnes-numZeros);
    }
}