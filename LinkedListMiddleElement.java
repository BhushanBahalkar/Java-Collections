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
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < count / 2; i++) {
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


    public int getlength(){
        Node temp =head;
        int count =0;
        while(temp!= null){
            temp = temp.next;
            count++;
        }
        System.out.println(count);
        return count;

    }
    public void deletemiddlenode(){
        int lengthofLL = getlength();
        int getMiddle = (lengthofLL / 2) - 1;

        Node temp = head;
        while(getMiddle > 0){
            temp = temp.next;
            getMiddle--;
        }

        Node temp2 = temp.next;
        temp.next = temp2.next;
        temp2.next = null;
    }
    

    public static void main(String[] args) {
        LinkedListMiddleElement list = new LinkedListMiddleElement();

//        list.add("20");
//        list.add("30");
//        list.add("50");
//        list.add("60");
//        list.add("70");

        list.printMyLinkedList();
        list.middleElement();
        System.out.println("After deleting middle element:");
        list.deletemiddlenode();
        list.printMyLinkedList();

    }
}
//This code finds middle element of linked list