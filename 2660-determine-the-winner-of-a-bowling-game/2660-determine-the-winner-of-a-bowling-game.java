class Solution {
    public int isWinner(int[] player1, int[]  player2) {
 int score1 = 0;
        int score2 = 0;
        boolean flag = false;
        
        for (int i = 0; i < player1.length; i++) {
            
             if (i - 2 >= 0 && player1[i - 2] == 10) {
                flag = true;
            }
            else if (i - 1 >= 0 && player1[i - 1] == 10) {
                flag = true;
            } 
            else flag = false;
           
            if (flag == true) score1 += (2 * player1[i]);
            else score1 += player1[i];
            
                    
            // System.out.println(player1[i]+" "+flag+" "+score1);
        }
        
        flag= false;
        
        for (int i = 0; i < player2.length; i++) {
            
            if (i - 2 >= 0 && player2[i - 2] == 10) {
                flag = true;
            } 
            else if (i - 1 >= 0 && player2[i - 1] == 10) {
                flag = true;
            }
            else flag = false;
          
            if (flag == true) score2 += (2 * player2[i]);
            else score2 += player2[i];
        }
        
        // System.out.println(score1);
        // System.out.println(score2);
        
        if (score1 > score2) return 1;
        else if (score2 > score1) return 2;
        
        return 0;
    }
}