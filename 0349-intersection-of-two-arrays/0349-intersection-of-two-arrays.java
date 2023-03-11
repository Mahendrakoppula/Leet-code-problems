class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> st1=new HashSet<>();
        
//         for(int i=0;i<nums1.length;i++){
//             st1.add(nums1[i]);
//         }
//         Set<Integer> st3=new HashSet<>();
//         for(int i=0;i<nums2.length;i++){
//             if(st1.contains(nums2[i])){
//                 st3.add(nums2[i]);
//             }
//         }
        
//         int[] result =new int[st3.size()];
//         int i=0;
//         for(int val:st3){
//             result[i++]=val;
//         }
//         return result;
        
        
//         int i=0;
//         int j=0;
//         Set<Integer>set= new HashSet<>();
        
//         while(i<nums1.length && j<nums2.length){
//             if(nums1[i]==nums2[j]){
//                 set.add(nums1[i]);
//                 i++;
//             j++;
//             }else if(nums1[i]<nums2[j]){
//                 i++;
//             }else{
//                 j++;
//             }   
//         }
//         int[] result= new int[set.size()];
//         int k=0;
//         for(int val: set){
//             result[k++]=val;
//         }
//         return result;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
          int i = 0, j = 0;
    Set<Integer> set = new HashSet<>();
    
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] == nums2[j]) {
            set.add(nums1[i]);
            i++;
            j++;
        } else if (nums1[i] < nums2[j]) {
            i++;
        } else {
            j++;
        }
    }

    int[] result = new int[set.size()];
    int k = 0;
    for (int num : set) {
        result[k++] = num;
    }
    return result;
    }
}