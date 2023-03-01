class Solution {
    public int[] sortArray(int[] arr) {
//         int n = arr.length;
//     if (n <= 1) {
//         return arr; // Nothing to sort
//     }
    
//     int mid = n / 2;
//     int[] leftArr = new int[mid];
//     int[] rightArr = new int[n - mid];
    
//     // Divide the input array into two halves
//     for (int i = 0; i < mid; i++) {
//         leftArr[i] = arr[i];
//     }
//     for (int i = mid; i < n; i++) {
//         rightArr[i - mid] = arr[i];
//     }
    
//     // Recursively sort the left and right halves
//     leftArr = sortArray(leftArr);
//     rightArr = sortArray(rightArr);
    
//     // Merge the sorted halves
//     int i = 0, j = 0, k = 0;
//     int[] result = new int[n];
//     while (i < leftArr.length && j < rightArr.length) {
//         if (leftArr[i] <= rightArr[j]) {
//             result[k++] = leftArr[i++];
//         } else {
//             result[k++] = rightArr[j++];
//         }
//     }
//     while (i < leftArr.length) {
//         result[k++] = leftArr[i++];
//     }
//     while (j < rightArr.length) {
//         result[k++] = rightArr[j++];
//     }
    
//     return result;
//     }
         int n = arr.length;
    int minRun = minRunLength(n);
    
    // Divide the input array into runs of minRun length and sort each run using insertion sort
    for (int i = 0; i < n; i += minRun) {
        int end = Math.min(i + minRun - 1, n - 1);
        insertionSort(arr, i, end);
    }
    
    // Merge adjacent runs until only one run remains
    for (int size = minRun; size < n; size = 2 * size) {
        for (int left = 0; left < n; left += 2 * size) {
            int mid = left + size - 1;
            int right = Math.min(left + 2 * size - 1, n - 1);
            merge(arr, left, mid, right);
        }
    }
    
    return arr;
}

private static int minRunLength(int n) {
    int r = 0;
    while (n >= 64) {
        r |= (n & 1);
        n >>= 1;
    }
    return n + r;
}

private static void insertionSort(int[] arr, int left, int right) {
    for (int i = left + 1; i <= right; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= left && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

private static void merge(int[] arr, int left, int mid, int right) {
    int len1 = mid - left + 1;
    int len2 = right - mid;

    // Check for negative array sizes
    if (len1 < 0 || len2 < 0) {
        return;
    }

    int[] leftArr = new int[len1];
    int[] rightArr = new int[len2];

    for (int i = 0; i < len1; i++) {
        leftArr[i] = arr[left + i];
    }
    for (int j = 0; j < len2; j++) {
        rightArr[j] = arr[mid + 1 + j];
    }

    int i = 0, j = 0, k = left;

    while (i < len1 && j < len2) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k] = leftArr[i];
            i++;
        } else {
            arr[k] = rightArr[j];
            j++;
        }
        k++;
    }

    while (i < len1) {
        arr[k] = leftArr[i];
        i++;
        k++;
    }

    while (j < len2) {
        arr[k] = rightArr[j];
        j++;
        k++;
    }
}
}
