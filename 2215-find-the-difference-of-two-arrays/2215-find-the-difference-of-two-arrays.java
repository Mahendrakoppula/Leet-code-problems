class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//         List<List<Integer>> ans= new ArrayList<>();
//         List<Integer>arr1=new ArrayList<>();
//         List<Integer> arr2= new ArrayList<>();
//         ans.add(arr1);
//         ans.add(arr2);
//         HashMap<Integer,Integer> hashmap= new HashMap<>();
//         for (int i:nums1){
//             hashmap.put(i, hashmap.getOrDefault(i,0)+1);
            
//         }

//         for(int j:nums2){
//             hashmap.put(j, hashmap.getOrDefault(j,0)+1);
//         }

//         for (int i:nums1){
//             if(hashmap.get(i)==1){
//                 arr1.add(i);
//             }
//         }

//         for (int j: nums2){
//             if (hashmap.get(j)==1){
//                 arr2.add(j);
//             }
//         }
        // return ans;
        
        Set<Integer> n1= new HashSet<>();
        Set<Integer>n2= new HashSet<>();
        List<Integer> list= new ArrayList<>();
        for(int i:nums1){
            n1.add(i);
        }
        for (int i:nums2){
            n2.add(i);
        }

        for (int i:nums2){
            if(n1.contains(i)){
                list.add(i);
            }
        }
        for (int i:list){
            n1.remove(i);
        }

        for (int i:list){
            n2.remove(i);
        }

        List<List<Integer>> ans= new ArrayList<>();
        ans.add(new ArrayList<>(n1));
        ans.add(new ArrayList<>(n2));
        return ans;
    }
}