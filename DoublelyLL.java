package Collection;

public class DoublelyLL extends Node{

    Node head =null;


    public Node createNode(String data){
        Node obj = new Node();
        obj.prev = null;
        obj.data = data;
        obj.next = null;
        return obj;
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
            newNode.prev = temp;
        }
    }

    public void addAt(int index, String data){

    }


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


//    public void printMyLList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }


    public static void main(String[] args) {

        DoublelyLL list = new DoublelyLL();

        list.add("20");
        list.add("30");
        list.add("50");
        list.add("60");
        list.printMyLList();
    }

}
