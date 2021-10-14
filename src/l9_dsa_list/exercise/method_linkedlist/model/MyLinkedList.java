package l9_dsa_list.exercise.method_linkedlist.model;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

    }

    // Phần tử đầu tiên của danh sách liên kết
    private Node head;
    //Số lượng phần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedList() {
    }

    /**
     * Phương thức thêm phần tử vào vị trí đầu tiên trong danh sách
     *
     * @param element
     */
    public void addFirst(E element) {
        //khai báo 1 biến là Temp trỏ dến giá trị của head
        Node temp = head;
        // biến head sẽ nhận 1 giá trị node mới
        head = new Node(element);
        //head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    /**
     * Phương thức thêm phần tử vào vị trí cuối cùng trong danh sách
     *
     * @param element
     */
    public void addLast(E element) {
        //khai báo 1 biến là Temp trỏ dến giá trị của head
        Node temp = head;
        // sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    /**
     * Phương thức thêm phần tử vào vị trí index bất kì
     * (cách làm liên kết đơn)
     *
     * @param index
     * @param element
     */

    public void add(int index, E element) {
        //khai báo 1 biến là Temp trỏ dến giá trị của head
        Node temp = head;
        //khai báo 1 node là holder
        Node holder;
        // cho con trỏ chạy đến vị trị index-1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chiếu(phần tử mới) đến vị trí index
        holder = temp.next;
        //node tại vị trí index-1 sẽ trỏ tới node mới
        temp.next = new Node(element);
        //node mới sẽ trỏ đến holder
        temp.next.next = holder;
        // tăng số lượng phần tử danh sách lên 1
        numNodes++;
    }

    /**
     * Phương thức lấy giá trị phần tự tại vị trí index bất kì
     *
     * @param index
     * @return
     */

    public Object get(int index) {
        //khai báo 1 biến là Temp trỏ dến giá trị của head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    /**
     * Phương thức lấy độ dài của danh sách
     *
     * @return
     */
    public int size() {
        return numNodes;
    }

    /**
     * Phương thức xóa 1 phần tử tại 1 vị trí index bất kì
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index : " + index);
        }
        //khai báo temp trỏ đến head
        Node temp = head;
        Object data;
        //nếu index = 0 sẽ trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    /**
     * Phương thức xóa phần tử bằng phần tử từ bên ngoài truyền vào
     *
     * @param element
     * @return
     */
    public boolean remove(E element) {
        //Remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                // Nếu như tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return true;
    }

    /**
     * Phương thức sao chép LinkedList
     *
     * @return
     */
    public MyLinkedList<E> clone() {
        // Check LinkedList có phần tử hay không?
        if (numNodes == 0) {
            throw new IllegalArgumentException("LinkedList is null");
        }
        //khai báo LinkedList trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        // Khai báo 1 temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head của node mới
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    /**
     * Phương thức tìm phần tử có trong LinkedList Không?
     *
     * @param element
     * @return
     */
    public boolean constrains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /**
     * Phương thức tìm index bằng phần tử truyền vào
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
