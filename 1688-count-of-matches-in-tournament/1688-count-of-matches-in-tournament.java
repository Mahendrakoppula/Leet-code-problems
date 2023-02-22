class Solution {
    public int numberOfMatches(int n) {
//          if (n == 1) return 0;
        
// 		// We declare an int to hold our recursive solution.
//         int res;
		
// 		// We initialize res using a recursive call, reducing n 
// 		// as described in the problem.
//         if (n % 2 == 0) {
//             res = numberOfMatches(n / 2);
// 			// After the recursive call is executed, we add the appropriate value to 
// 			// our solution variable.
//             res += n / 2;
//         }
//         else {
//             res = numberOfMatches((n - 1) / 2 + 1);
//             res += (n - 1) / 2;
//         }
        
// 		// Our initial call to numberOfMatches()
// 		// will return the total number of matches 
// 		// added to res in each recursive call.
//         return res;
          if (n == 1) return 0;
		
		int res = n % 2 == 0 ? numberOfMatches(n / 2) + n / 2 : numberOfMatches((n - 1) / 2 + 1) + (n - 1) / 2;
		
        return res;
    }
}