package Collection;

public class Queue {
    int start = 0;
    int end = 0;

    public void enqueue(int data, int[] arr){
       arr[start] = data;
       start++;
    }

    public void dequeue(int[] arr) {
        arr[end] = 0;
        int Element = arr[end];
        System.out.println("Element: " + arr[end]);
        arr[end] = 0;
        end++;
    }

    public void printQueue(int[] arr){
        for(int i =end; i< start; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        Queue myQueue = new Queue();
//
//        myQueue.enqueue(10, arr);
//        myQueue.enqueue(20, arr);
//        myQueue.enqueue(30, arr);
//        myQueue.enqueue(40, arr);
//        myQueue.enqueue(50, arr);

        myQueue.printQueue(arr);
        myQueue.dequeue(arr);
        myQueue.printQueue(arr);

    }
}
