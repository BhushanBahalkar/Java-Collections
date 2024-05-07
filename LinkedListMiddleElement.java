package Collection;

public class LinkedListMiddleElement extends Node {
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

    public void middleElement() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int tempp = 0;
        Node temp = head;
        while (temp != null) {
            tempp++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < tempp / 2; i++) {
            temp = temp.next;
        }
        System.out.println("Middle element: " + temp.name);
    }

    public void printMyLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListMiddleElement list = new LinkedListMiddleElement();

        list.add("20");
        list.add("30");
        list.add("50");
        list.add("60");
        list.add("70");

        list.printMyLinkedList();
        list.middleElement();
    }
}
