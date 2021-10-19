package l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model;

public class Node {
    public int data; // giá trị của node
    public Node link; // trỏ tham chiếu đến node next

    public Node() {
    }

    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }
}
