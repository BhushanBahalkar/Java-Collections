package Collection;

public class MyLinkedList extends Node {
    Node head = null;

    public Node createNode(String name) {
        Node node = new Node();
        node.name = name;
        node.next = null;
        return node;
    }

    public void add(String name) {
        Node newNode = createNode(name);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = createNode(String.valueOf(data));
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }






//    public void addAt(int index , int data){
//        Node newNode = createNode(String.valueOf(data));
//
//        if (index == 0){
//            newNode.next = head;
//            head = newNode;
//        }
//         head = null;
//         temp = head;
//        int tempIndex = 0;
//
//        while (temp != null && tempIndex < index) {
//            head = temp;
//            temp = temp.next;
//            tempIndex++;
//        }
//        newNode.next = head;
//        head = newNode;
//    }


    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index: " + index);
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            head = head.next;
        }
        Node temp = head.next;
        head.next = temp.next;
    }



    public void printMyLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("20");
        list.add("30");
        list.add("50");
        list.add("60");
        list.addFirst(100);
        list.addFirst(200);
//        list.addAt(0 , 10);
//        list.addAt(3, 40);
//        list.removeAtIndex(1);
//        list.remove(3);

        list.removeFirst();
        System.out.println("First element removed");
        list.removeLast();
        System.out.println("Last element removed");
        list.printMyLinkedList();
    }
}
