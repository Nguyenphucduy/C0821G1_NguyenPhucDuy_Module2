package l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.controller;

import l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model.Queue;
import l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model.Solution;

public class SolutionTest {
    public static void main(String[] args) {
        // Create a queue and initialize front and rear(tạo Queue mới và phần tử đầu tiên và cuối cùng)
        Solution solution = new Solution();
        Queue queue = new Queue();
        queue.front = queue.rear = null;

        // add elements in Circular Queue
        solution.enQueue(queue, 14);
        solution.enQueue(queue, 22);
        solution.enQueue(queue, 6);

        // Display elements present in Circular Queue
        solution.displayQueue(queue);

        // Deleting elements from Circular Queue
        System.out.printf(" Deleted value = %d", solution.deQueue(queue));
        System.out.printf(" Deleted value = %d", solution.deQueue(queue));

        // Remaining elements in Circular Queue
        solution.displayQueue(queue);

//        solution.enQueue(queue, 9);
//        solution.enQueue(queue, 20);
//        solution.displayQueue(queue);

    }
}
