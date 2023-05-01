class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        // int count=0;
//         int ans=0;
//         double total_ans=0;
//         for(int i=1;i<salary.length-1;i++){
//             ans+=salary[i];
//             count++;
//         }
//         total_ans=ans/count;
        
//          return total_ans;
        int sum=0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return (double) sum / (salary.length - 2);
    }
   
}