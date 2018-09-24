// Implement the following operations of a queue using stacks.

// push(x) -- Push element x to the back of queue.
// pop() -- Removes the element from in front of queue.
// peek() -- Get the front element.
// empty() -- Return whether the queue is empty.
// Example:

// MyQueue queue = new MyQueue();

// queue.push(1);
// queue.push(2);  
// queue.peek();  // returns 1
// queue.pop();   // returns 1
// queue.empty(); // returns false


class MyQueue {
    Stack<Integer> s1 =new Stack();
    Stack<Integer> s2=new Stack();
    // Push element x to the back of queue.
    public void push(int x) {
        while(!s2.isEmpty())
            s1.push(s2.pop());
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!s1.isEmpty())
        s2.push(s1.pop());
        s2.pop();
    }

    // Get the front element.
    public int peek() {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        return s2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
        
    }
}