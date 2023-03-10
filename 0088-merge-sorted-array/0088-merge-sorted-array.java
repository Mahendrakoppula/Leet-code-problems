class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr1={1};
            if(m==0 || n==0 || n==1 ){
                System.out.println(Arrays.toString(arr1));
            }
            for(int i=m;i<=nums1.length-1;){
                for(int j=0;j<=nums2.length-1;j++)
                {
                    nums1[i]=nums2[j];
                    i++;
                }
            }
                Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
        }
    }