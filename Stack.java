package Collection;

public class Stack {

    int[] stack =new int[10];
    int temp =-1;

    public void push(int data){
        if((stack.length -1)==(temp)){

        }else
            temp++;
            stack[temp]= data;

    }
    public void pop(){
        if (temp == -1){

        }
        int val = stack[temp];
        stack[temp]= 0;
        temp--;
        return;
    }


    public int peek() {
        if (temp == -1) {
            System.out.println("Stack is empty......");
            return 0;
        }
        else {
            int val = stack[temp];
            return val;
        }
        }


    public void printStack() {
        System.out.println("Stack elements:");
        for (int i = temp; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

class Stackmain{
    public static void main(String[] args) {
        Stack obj = new Stack();

        try {
            for (int i = 0; i < 10; i++) {

            }

        } catch (StackOverflowError ex) {
            System.out.println("Stack Overflow >>>>");
        }

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.push(70);


        obj.pop();
        obj.pop();


        obj.printStack();

        System.out.println("Top element is :"+ obj.peek());

    }
}
