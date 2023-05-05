class Solution {
    public int maxVowels(String s, int k) {
//        int count=0;
//         int max_count=0;
//         char[] chr=s.toCharArray();
//         int n=chr.length;
//         for(int i=0;i<=n-k;i++){
//             for(int j=i;j<i+k;j++){
//                 if("aeiou".indexOf(chr[j]) != -1){
//                     count++;
//                 }
//                 max_count=Math.max(count,max_count);
//             }
//             count=0;

//         }
//         return max_count;
        
        
        int maxCount = 0;
    int currCount = 0;
    String vowels = "aeiou";
    int n = s.length();
    for (int i = 0; i < k; i++) {
        if (vowels.indexOf(s.charAt(i)) != -1) {
            currCount++;
        }
    }
    maxCount = currCount;
    for (int i = k; i < n; i++) {
        if (vowels.indexOf(s.charAt(i - k)) != -1) {
            currCount--;
        }
        if (vowels.indexOf(s.charAt(i)) != -1) {
            currCount++;
        }
        maxCount = Math.max(maxCount, currCount);
    }
    return maxCount;
    }
}