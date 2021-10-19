package l10_dsa_stack_and_queue.exercise.circular_linkedlist_implements_queue.model;

public class Solution {
    /**
     * Phyơng thức chèn 1 phần tử
     *
     * @param queue
     * @param value
     */
    public void enQueue(Queue queue, int value) {

        Node temp = new Node(); // tạo node mới tham chiếu giá trị tới temp
        temp.data = value; //  gán giá trị vào temp
        if (queue.front == null)//Kiểm tra hàng đợi trống hay không.
            queue.front = queue.rear = temp;
        else
            queue.rear.link = temp; //node rear luôn chứa địa chỉ của node front: .link

        queue.rear = temp;
        queue.rear.link = queue.front; // tạo liên kết

    }

    /**
     * method  thực hiện lấy ra 1 phần tử và xóa.Trong hàng đợi liên kết vòng, luôn lấy ra vị trị Front.
     *
     * @param queue
     * @return
     */
    public int deQueue(Queue queue) {
        if (queue.front == null)// Kiểm tra hàng đợi trống hay không
        {
            System.out.print("Queue is empty");
            return Integer.MIN_VALUE; // MIN_VALUE  constant of class Interger
        }

        int value; // Value to be dequeued
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = queue.rear = null;
        } else {
            /**
             * tạo liên kết vòng
             */
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }

        return value;

    }

    /**
     * method hiển thị phần tử
     *
     * @param queue
     */
    public void displayQueue(Queue queue) {
        Node temp = queue.front;
        System.out.print(" Elements in Circular Queue are : ");
        while (temp.link != queue.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

}
