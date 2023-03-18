class MyQueue {
    Stack<Integer> incoming;
    Stack<Integer> outgoing;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        incoming = new Stack<>();
        outgoing = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        incoming.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (outgoing.isEmpty()) {
            while (!incoming.isEmpty()) {
                outgoing.push(incoming.pop());
            }
        }
        return outgoing.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (outgoing.isEmpty()) {
            while (!incoming.isEmpty()) {
                outgoing.push(incoming.pop());
            }
        }
        return outgoing.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return incoming.isEmpty() && outgoing.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */