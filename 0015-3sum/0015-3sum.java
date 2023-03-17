class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
    //      List<List<Integer>> result = new ArrayList<>();
    // Arrays.sort(nums);
    // int n = nums.length;
    // for (int i = 0; i < n - 2; i++) {
    //     if (i == 0 || nums[i] != nums[i-1]) {
    //         int j = i + 1, k = n - 1;
    //         while (j < k) {
    //             int sum = nums[i] + nums[j] + nums[k];
    //             if (sum == 0) {
    //                 result.add(Arrays.asList(nums[i], nums[j], nums[k]));
    //                 while (j < k && nums[j] == nums[j+1]) j++;
    //                 while (j < k && nums[k] == nums[k-1]) k--;
    //                 j++;
    //                 k--;
    //             } else if (sum < 0) {
    //                 j++;
    //             } else {
    //                 k--;
    //             }
    //         }
    //     }
    // }
    // return result;
        
//         int n=nums.length;
//         List<List<Integer>> res= new ArrayList<>();
//         HashMap<Integer,Integer> map= new HashMap<>();

//         HashSet<Integer> result= new HashSet<>();
//         res.add(new ArrayList<>(result));        
//         for(int i:nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }

//         for (int i = 0; i < n-1 ; i++) {
//             // map.get(nums[i]--);
//                         map.put(nums[i], map.get(nums[i]) - 1);
//             for (int j = i+1; j < n; j++) {
//                 // map.get(nums[j]--);
//                     map.put(nums[j], map.get(nums[j]) - 1);
//                 if(map.containsKey(-(nums[i]+nums[j]))){
//                     result.add(nums[i]);
//                     result.add(nums[j]);
//                     result.add(-(nums[i]+nums[j]));
//                     res.add(new ArrayList<>(result));
//                     result.clear();
//                 }
//                 // map.get(nums[j]++);
//                   map.put(nums[j], map.get(nums[j]) + 1);
//             }
//             // map.get(nums[i]++);
//             map.put(nums[i], map.get(nums[i]) + 1);
//         }
//          res.remove(0);
//     return res;
        
//         int n = nums.length;
//     List<List<Integer>> res = new ArrayList<>();
//     HashMap<Integer, Integer> map = new HashMap<>();

//     for (int i : nums) {
//         map.put(i, map.getOrDefault(i, 0) + 1);
//     }

//     for (int i = 0; i < n-2 ; i++) {
//         map.put(nums[i], map.get(nums[i]) - 1);
//         for (int j = i+1; j < n-1; j++) {
//             map.put(nums[j], map.get(nums[j]) - 1);
//             int third = -(nums[i] + nums[j]);
//             if (map.containsKey(third) && map.get(third) > 0) {
//                 res.add(Arrays.asList(nums[i], nums[j], third));
//                 map.put(third, map.get(third) - 1);
//             }
//             map.put(nums[j], map.get(nums[j]) + 1);
//         }
//         map.put(nums[i], map.get(nums[i]) + 1);
//     }

//     return res;
        
        
//         int n = nums.length;
//     List<List<Integer>> res = new ArrayList<>();
//     HashMap<Integer, Integer> map = new HashMap<>();

//     HashSet<List<Integer>> result = new HashSet<>();
//     for (int i : nums) {
//         map.put(i, map.getOrDefault(i, 0) + 1);
//     }

//     for (int i = 0; i < n - 2; i++) {
//         map.put(nums[i], map.get(nums[i]) - 1);
//         for (int j = i + 1; j < n - 1; j++) {
//             map.put(nums[j], map.get(nums[j]) - 1);
//             int complement = -(nums[i] + nums[j]);
//             if (map.containsKey(complement) && map.get(complement) > 0) {
//                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
//                 triplet.sort(null); // sort the triplet to avoid duplicates
//                 result.add(triplet);
//             }
//             map.put(nums[j], map.get(nums[j]) + 1);
//         }
//         map.put(nums[i], map.get(nums[i]) + 1);
//     }
//     res.addAll(result); // add all the unique triplets to the result
//     return res;
        
        int n = nums.length;
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums); // sort the array
    for (int i = 0; i < n-2; i++) {
        if (i > 0 && nums[i] == nums[i-1]) { // skip duplicates
            continue;
        }
        int j = i+1, k = n-1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while (j < k && nums[j] == nums[j-1]) { // skip duplicates
                    j++;
                }
                while (j < k && nums[k] == nums[k+1]) { // skip duplicates
                    k--;
                }
            } else if (sum < 0) {
                j++;
            } else {
                k--;
            }
        }
    }
    return res;
    }
}