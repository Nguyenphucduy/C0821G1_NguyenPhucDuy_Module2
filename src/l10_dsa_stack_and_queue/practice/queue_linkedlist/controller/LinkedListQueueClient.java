package l10_dsa_stack_and_queue.practice.queue_linkedlist.controller;

import l10_dsa_stack_and_queue.practice.queue_linkedlist.model.MyLinkedListQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
//        System.out.println(queue.dequeue().key);
        queue.dequeue();
        queue.enqueue(30);
//        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
