package l10_dsa_stack_and_queue.practice.optionnal_stack_array.model;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    /**
     * Thêm phần tử vào stack
     * @param element
     */
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    /**
     * Xóa phần tử khỏi stack
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    /**
     * Check Size
     * @return
     */
    public int size() {
        return index;
    }

    /**
     * Check stack rỗng hay không?
     * @return
     */
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    /**
     * Check stack đầy hay chưa
     * @return
     */
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
