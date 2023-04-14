class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] arr1={1};
        //     if(m==0 || n==0 || n==1 ){
        //         System.out.println(Arrays.toString(arr1));
        //     }
        //     for(int i=m;i<=nums1.length-1;){
        //         for(int j=0;j<=nums2.length-1;j++)
        //         {
        //             nums1[i]=nums2[j];
        //             i++;
        //         }
        //     }
        //         Arrays.sort(nums1);
        //     System.out.println(Arrays.toString(nums1));
        
        if (n == 0) {
        return;
    }
    
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }
    
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
        }
    }