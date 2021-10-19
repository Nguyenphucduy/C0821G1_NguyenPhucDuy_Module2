package l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model;

import l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model.Node;

public class Queue {
    //Front là phần tử được đưa vào đầu tiên trong hàng đợi
    //Rear là phần tử được đưa vào cuối cùng trong hàng đợi
    public Node front,rear;


    public Queue() {
    }

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

}
