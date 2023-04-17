class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//         List<Boolean>list= new ArrayList<>(candies.length);
//         Collections.fill(list,true);
//         int min=arr[0];
//         for(int i=0;i<=candies.length-1;i++){
//             candies[i]=candies[i]+extraCandies;
//         }
        
//    for (int i = 0; i <candies.length; i++) {
//         if (candies[i] < min) {
//             min = candies[i];
//             list.set(i,false);
//         }
//     }
//         return list;
        
        List<Boolean> list = new ArrayList<>();
       // for (int i=0;i<candies.length;i++){
       //     list.add(true);
       // }
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
//                list.set(i, false);
            }
        }
                for (int i = 0; i <= candies.length - 1; i++) {
                  
            candies[i] = candies[i] + extraCandies;  
                    if (candies[i]<max){
                        list.add(false);
                    }else{
                         list.add(true);
                    }
        }
        return list;
        }
    }