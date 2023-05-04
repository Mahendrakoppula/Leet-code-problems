class Solution {
    public String predictPartyVictory(String senate) {
        // Queue<Integer>qr=new LinkedList<>();
        // Queue<Integer>qd= new LinkedList<>();

        // for(int i=0;i<senate.toCharArray().length;i++){
        //     if(senate.charAt(i)=='R'){
        //         qr.offer(i);
        //     }else{
        //         qd.offer(i);
        //     }
        // }
        // int n=senate.length();
        // while(!qr.isEmpty()&& !qd.isEmpty()){
        //     int qr_id=qr.poll();
        //     int qd_id=qd.poll();

        //     if(qr_id<qd_id){
        //         qr.offer(qr_id+n);
        //     }else{
        //         qd.offer(qd_id+n);
        //     }
        // }
        // return(qr.size()>qd.size())?"Radiant":"Dire";

        Deque<Character>queue= new ArrayDeque<>();

        char c='R';
        
        for(char ch:senate.toCharArray()){
            queue.offer(ch);
        }
        
        while(!queue.isEmpty()){
            c=queue.poll();
            queue.offer(c);
            
            if(c=='R' && !queue.remove('D')){
                return "Radiant";
            }else if(c=='D'&&!queue.remove('R')){
                return "Dire";
            }
        }
        return null;
    }
}