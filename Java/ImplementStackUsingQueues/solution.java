// Implement the following operations of a stack using queues.

// push(x) -- Push element x onto stack.
// pop() -- Removes the element on top of the stack.
// top() -- Get the top element.
// empty() -- Return whether the stack is empty.
// Example:

// MyStack stack = new MyStack();

// stack.push(1);
// stack.push(2);  
// stack.top();   // returns 2
// stack.pop();   // returns 2
// stack.empty(); // returns false

class MyStack {
    // Push element x onto stack.
    Queue<Integer> q1 = new LinkedList<Integer>();
    public void push(int x) {
        q1.add(x);
        for (int i=0;i<q1.size()-1;i++)
        {
            q1.add(q1.poll());
            //q1.poll();
        }
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        q1.poll();
        
    }

    // Get the top element.
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}