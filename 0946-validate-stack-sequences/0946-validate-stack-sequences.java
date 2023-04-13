class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        // Stack<Integer> stack= new Stack<>();
        // int i=0;
        // int j=0;
        // while(i<=pushed.length-1){
        //     if(pushed[i]!=popped[j]){
        //         stack.push(pushed[i]);
        //         i++;
        //     }else if(pushed[i]==popped[j] || stack.peek()==popped[i]){
        //         stack.push(pushed[i]);
        //         stack.pop();
        //         j++;
        //         i++;
        //         // stack.pop();
        //     // }else if(stack.peek()==popped[i]){
        //     //     stack.pop();
        //     }
        // }   
        // return stack.isEmpty();
    //     Stack<Integer> stack= new Stack<>();
    // int i=0;
    // int j=0;
    // while(i<=pushed.length-1){
    //     if(pushed[i]!=popped[j]){
    //         stack.push(pushed[i]);
    //         i++;
    //     }
    //     if(pushed[i]==popped[j]){
    //         stack.push(pushed[i]);
    //         stack.pop();
    //         j++;
    //         i++;
    //         if(i == pushed.length-1) {
    //             break;
    //         }
    //         if(stack.peek()==popped[j])
    //             stack.pop();
    //     }
    // }
    // while(!stack.isEmpty() && stack.peek() == popped[j]) {
    //     stack.pop();
    //     j++;
    // }
    // return stack.isEmpty();
        
        Stack<Integer> stack = new Stack<>();
 
    int j = 0;
    for(int i: pushed){
        stack.push(i);
        while(!stack.isEmpty() && stack.peek()==popped[j]){
            stack.pop();
            j++;
        }
    }
    return stack.isEmpty();
        
    //      int n = pushed.length;
    // int i = 0, j = 0;
    // for (int k : pushed) {
    //     pushed[i++] = k;
    //     while (i > 0 && pushed[i - 1] == popped[j]) {
    //         i--;
    //         j++;
    //     }
    // }
    // return i == 0;
    }
}