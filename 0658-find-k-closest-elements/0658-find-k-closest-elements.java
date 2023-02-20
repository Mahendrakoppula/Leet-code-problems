class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//         List<Integer>result=new ArrayList<>();
        
//         for(int i=0;i<=arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
// //                 if(Math.abs(arr[i]-x)<Math.abs(arr[j]-x) ||Math.abs(arr[i]-x)==Math.abs(arr[j]-x)){
// //                     result.add(i);
// //                     result.add(j);
// //                 }
                
//                 if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
//                 // add arr[i] to result if it is closer or has the same distance as arr[j]
//                 result.add(arr[i]);
//             } else {
//                 // add arr[j] to result if it is closer than arr[i]
//                 result.add(arr[j]);
//             }
//                 if(result.size()==k){
//                     Collections.sort(result);
//                     return result;
//                 }
                    
//             }
//         }
//         Collections.sort(result);
//         return result;
//     }
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    List<Integer> result = new ArrayList<>();

    // Create a list of pairs (distance, element) for each element in the array
    List<Pair<Integer, Integer>> distances = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        distances.add(new Pair<>(Math.abs(arr[i] - x), arr[i]));
    }

    // Sort the list based on distances
    distances.sort((a, b) -> a.getKey() - b.getKey());

    // Take the first k elements from the sorted list
    for (int i = 0; i < k; i++) {
        result.add(distances.get(i).getValue());
    }

    // Sort the result in ascending order
    result.sort((a, b) -> a - b);

    return result;
}

}