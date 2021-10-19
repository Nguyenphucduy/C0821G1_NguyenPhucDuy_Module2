package l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.controller;

import l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model.Queue;
import l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model.Solution;

public class SolutionTest {
    public static void main(String[] args) {
        // Create a queue and initialize front and rear
        Solution solution = new Solution();
        Queue q = new Queue();
        q.front = q.rear = null;

        // Inserting elements in Circular Queue
        solution.enQueue(q, 14);
        solution.enQueue(q, 22);
        solution.enQueue(q, 6);

        // Display elements present in Circular Queue
        solution.displayQueue(q);

        // Deleting elements from Circular Queue
        System.out.printf(" Deleted value = %d", solution.deQueue(q));
        System.out.printf(" Deleted value = %d", solution.deQueue(q));

        // Remaining elements in Circular Queue
        solution.displayQueue(q);

        solution.enQueue(q, 9);
        solution.enQueue(q, 20);
        solution.displayQueue(q);

    }
}
