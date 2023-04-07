class Solution {
    public long distinctNames(String[] ideas) {
//           int count=0;
//         HashSet<String> set= new HashSet<>();
//         for(String s:ideas){
//             set.add(s);
//         }
// //        System.out.println(set);

//         for (int i = 0; i < ideas.length; i++) {

//            char[] c= ideas[i].toCharArray();
// //            System.out.println(Arrays.toString(c));
//             for (int j = 0; j < ideas.length; j++) {
//                 char[] d= ideas[j].toCharArray();
//                 if(ideas[i].equals(ideas[j])){
//                     continue;
//                 }
// //                System.out.println(Arrays.toString(d));
//                 char ch= c[0];
//                 c[0]=d[0];
//                 d[0]=ch;
//                 String st= new String(c);
//                 String s= new String(d);
//                if(!set.contains(st) && !set.contains(s)){
//                     count++;
//                     d[0]=c[0];
//                     c[0]=ch;
//                 }else {
//                    d[0]=c[0];
//                    c[0]=ch;
//                 }
//             }
//         }
//        return count;
//     }
        
        
        //   Set<String> set = Arrays.stream(ideas).collect(Collectors.toSet());
        // int count = 0;
        // for (int i = 0; i < ideas.length; i++) {
        //     char[] c = ideas[i].toCharArray();
        //     for (int j = 0; j < ideas.length; j++) {
        //         if (i == j) continue;
        //         char[] d = ideas[j].toCharArray();
        //         char ch = c[0];
        //         c[0] = d[0];
        //         d[0] = ch;
        //         String st = new String(c);
        //         String s = new String(d);
        //         if (!set.contains(st) && !set.contains(s)) {
        //             count++;
        //         }
        //         d[0] = c[0];
        //         c[0] = ch;
        //     }
        // }
        // return count;
        
        
         Map<Character, Set<String>> wordMap = new HashMap<>();
        for (String word : ideas) {
            char firstChar = word.charAt(0);
            String suffix = word.substring(1);
            Set<String> suffixes = wordMap.getOrDefault(firstChar, new HashSet<>());
            suffixes.add(suffix);
            wordMap.put(firstChar, suffixes);
        }
        
        long count = 0;
        // Iterate over all pairs of first characters
        for (char char1 : wordMap.keySet()) {
            for (char char2 : wordMap.keySet()) {
                if (char1 == char2) {
                    continue;
                }
                Set<String> suffixes1 = wordMap.get(char1);
                Set<String> suffixes2 = wordMap.get(char2);
                
                int intersect = 0;
                // Count the number of common suffixes
                for (String suffix : suffixes1) {
                    if (suffixes2.contains(suffix)) {
                        intersect++;
                    }
                }
                int distinct1 = suffixes1.size() - intersect;
                int distinct2 = suffixes2.size() - intersect;
                count += distinct1 * distinct2;
            }
        }
        return count;
}
}