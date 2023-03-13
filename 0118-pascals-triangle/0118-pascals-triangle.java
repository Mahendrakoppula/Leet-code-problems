class Solution {
    public List<List<Integer>> generate(int numRows) {
        //  // Create an array list to store the output result...
        // List<List<Integer>> output = new ArrayList<List<Integer>>();
        // // Base cases...
	    // if (numRows <= 0)  return output;
        // // Create an array list to store the prev triangle value for further addition...
	    // ArrayList<Integer> prev = new ArrayList<Integer>();
        // // Inserting for the first row & store the prev array to the output array...
	    // prev.add(1);
	    // output.add(prev);
        // // For rest of the rows, Traverse all elements through a for loop...
	    // for (int i = 2; i <= numRows; i++) {
        //     // Create another array to store the current triangle value...
		//     ArrayList<Integer> curr = new ArrayList<Integer>();
		//     curr.add(1);    //first
        //     // Calculate for each of the next values...
		//     for (int j = 0; j < prev.size() - 1; j++) {
        //         // Inserting the addition of the prev arry two values...
		// 	    curr.add(prev.get(j) + prev.get(j + 1));    //middle
		//     }
        //     // Store the number 1...
		//     curr.add(1);    //last
        //     // Store the value in the Output array...
		//     output.add(curr);
        //     // Set prev is equal to curr...
		//     prev = curr;
	    // }
	    // return output;      // Return the output list of pascal values...
        int[][] pascal = new int[numRows][];
        for (int i = 0; i < numRows; i++){
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++){
                row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            pascal[i] = row;
        }
        return (List)Arrays.asList(pascal);
    }
}