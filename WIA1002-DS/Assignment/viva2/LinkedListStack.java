public class LinkedListStack<T> {
    private static class StackNode<T> {
        private final T data;
        private StackNode<T> next;

        private StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> head;

    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);
        newNode.next = head;
        head = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T data = head.data;
        head = head.next;
        return data;
    }

    public T peek() {
        return isEmpty() ? null : head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }
}
