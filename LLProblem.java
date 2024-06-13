package Collection;

public class LLProblem {
    Node head =null;

//
//    public Node createNode(String data){
//        Node obj = new Node();
//        obj.prev = null;
//        obj.data = data;
//        obj.next = null;
//        return obj;
//    }
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
    public void printMyLList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("|" +temp.data+ "|");
            temp = temp.next;
        }
        System.out.println("Null");
        System.out.println();
    }

//    public int lengthofLL(){
//        Node temp = head;
//        int lengthofLL
//    }







}
//This is the code that solves linked list problem