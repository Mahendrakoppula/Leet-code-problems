class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        /* approach 1
        List<Integer>result=new ArrayList<>();
        
        for(int i=0;i<=arr.length;i++){
                
                if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                // add arr[i] to result if it is closer or has the same distance as arr[j]
                result.add(arr[i]);
            } else {
                // add arr[j] to result if it is closer than arr[i]
                result.add(arr[j]);
            }
                if(result.size()==k){
                    Collections.sort(result);
                    return result;
                }
                    
            }
        }
        Collections.sort(result);
        return result;
    }
    */
        
        /* Approach 2 Using JavaFX
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
*/
    
        /*
        Approach 3
      List<List<Integer>> result = new ArrayList<>();

    List<int[]> distances = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        int[] pair = new int[2];
        pair[0] = arr[i];
        pair[1] = Math.abs(arr[i] - x);
        distances.add(pair);
    }

    distances.sort(Comparator.comparingInt(a -> a[1]));

    for (int i = 0; i < k; i++) {
        List<Integer> temp = new ArrayList<>();
        temp.add(distances.get(i)[0]);
        result.add(temp);
    }

    result.sort(Comparator.comparingInt(a -> a.get(0)));
    
    // Flatten the nested list of lists into a single list of integers
    List<Integer> flattenedResult = new ArrayList<>();
    for (List<Integer> sublist : result) {
        flattenedResult.addAll(sublist);
    }

    return flattenedResult;
    }
*/
        
        //Optimized
    int left = 0, right = arr.length - 1;
    while (right - left >= k) {
        if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
            left++;
        } else {
            right--;
        }
    }
    List<Integer> result = new ArrayList<>();
    for (int i = left; i <= right; i++) {
        result.add(arr[i]);
    }
    return result;
}
}