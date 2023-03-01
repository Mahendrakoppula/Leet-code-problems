class Solution {
    public int[] sortArray(int[] arr) {
        int n = arr.length;
    if (n <= 1) {
        return arr; // Nothing to sort
    }
    
    int mid = n / 2;
    int[] leftArr = new int[mid];
    int[] rightArr = new int[n - mid];
    
    // Divide the input array into two halves
    for (int i = 0; i < mid; i++) {
        leftArr[i] = arr[i];
    }
    for (int i = mid; i < n; i++) {
        rightArr[i - mid] = arr[i];
    }
    
    // Recursively sort the left and right halves
    leftArr = sortArray(leftArr);
    rightArr = sortArray(rightArr);
    
    // Merge the sorted halves
    int i = 0, j = 0, k = 0;
    int[] result = new int[n];
    while (i < leftArr.length && j < rightArr.length) {
        if (leftArr[i] <= rightArr[j]) {
            result[k++] = leftArr[i++];
        } else {
            result[k++] = rightArr[j++];
        }
    }
    while (i < leftArr.length) {
        result[k++] = leftArr[i++];
    }
    while (j < rightArr.length) {
        result[k++] = rightArr[j++];
    }
    
    return result;
    }
}