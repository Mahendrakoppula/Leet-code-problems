class Solution {
    public int maximumWealth(int[][] accounts) {
       var maxWealth = 0;

	for (var customer : accounts) {
		var wealth = 0;
		
		for (var account : customer)
			wealth += account;
			
		maxWealth = Math.max(maxWealth, wealth);
	}
	return maxWealth;
    }
}