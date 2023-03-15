class Solution {
    public List<String> removeAnagrams(String[] words) {
       
//         ArrayList<String> al= new ArrayList<>();
//         for(String st:words){
//             al.add(st);
//         }
        
//        int i=0;
//         while(i<al.size()-1){
//             int j=i+1;
//             while(j<al.size()){
//             if(isAnagram(al.get(i), al.get(j))){
//                 al.remove(j);
//             }else{
//                 j++;
//             }
//           }
//             i++;
//         }
//         return al;
//     }
        
//         List<String> al = new ArrayList<>(Arrays.asList(words));
//         int i = 0;
//         while (i < al.size() - 1) {
//             int j = i + 1;
//             while (j < al.size()) {
//                 if (isAnagram(al.get(i), al.get(j))) {
//                     al.remove(j);
//                 } else {
//                     j++;
//                 }
//             }
//             i++;
//         }
//         return al;
//     }
        
//         for(int i=0;i< al.size();i++){
//             for (int j = 1; j < al.size(); ) {
//                 if(isAnagram(al.get(i),al.get(j))){
//                     al.remove(j);
//                 }
//                 j++;
//             }
//         }
//         return al;
//     }
        
//         public static boolean isAnagram(String str1, String str2) {
//     // Convert the two strings to character arrays
//     char[] arr1 = str1.toCharArray();
//     char[] arr2 = str2.toCharArray();
    
//     // Sort the two arrays
//     Arrays.sort(arr1);
//     Arrays.sort(arr2);
    
//     // Convert the sorted arrays back to strings and compare them
//     String sortedStr1 = new String(arr1);
//     String sortedStr2 = new String(arr2);
    
//     return sortedStr1.equals(sortedStr2);
        
//         Map<String, List<String>> groups = new HashMap<>();
//         for (String word : words) {
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String sorted = new String(chars);
//             groups.putIfAbsent(sorted, new ArrayList<>());
//             groups.get(sorted).add(word);
//         }

//         // Keep only the first word in each group
//         List<String> keptWords = new ArrayList<>();
//         for (List<String> group : groups.values()) {
//             keptWords.add(group.get(0));
//         }

//         return keptWords;
        
         if(words.length==1) return Arrays.asList(words);
        List<String> result = new ArrayList<>();
        int i=0,j=1;
        while(j<words.length){
            while(j<words.length && isAnagram(words[i],words[j]))
                j++;
            result.add(words[i]);
            i=j;
        }
        return result;
    }

    private boolean isAnagram(String s1,String s2){
        char[] arr = new char[26];
        for (char c: s1.toCharArray()) arr[c-'a']++;
        for (char c: s2.toCharArray()) arr[c-'a']--;
        for(char c: arr)
            if(c!=0)
                return false;
        return true;
}

    }