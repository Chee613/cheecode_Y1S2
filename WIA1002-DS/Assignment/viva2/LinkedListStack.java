// Generic stack implemented with a singly linked list.
public class LinkedListStack<T> {
    // Internal node type used only by the stack.
    private static class StackNode<T> {
        // Value stored in this stack node.
        private final T data;
        // Link to the next node below this one.
        private StackNode<T> next;

        private StackNode(T data) {
            // Save the data carried by this stack node.
            this.data = data;
        }
    }

    // Head node acts as the top of the stack.
    private StackNode<T> head;

    public void push(T data) {
        // Create a new node for the pushed value.
        StackNode<T> newNode = new StackNode<>(data);
        // Point the new node to the old top node.
        newNode.next = head;
        // Make the new node the new top of the stack.
        head = newNode;
    }

    public T pop() {
        // Return null when the stack has no items to remove.
        if (isEmpty()) {
            return null;
        }

        // Capture the top value before unlinking it.
        T data = head.data;
        // Move the top pointer down to the next node.
        head = head.next;
        // Return the removed top value.
        return data;
    }

    public T peek() {
        // Return the top value without removing it.
        return isEmpty() ? null : head.data;
    }

    public boolean isEmpty() {
        // The stack is empty when there is no head node.
        return head == null;
    }

    public void clear() {
        // Remove all stack contents by dropping the head reference.
        head = null;
    }
}
