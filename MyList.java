package Collection;

import java.util.ArrayList;
import java.util.List;

public interface MyList<M> {
    void add(M data);
    void set(int index, M data);
    List<M> toList();
}

class MyArrayList<M> implements MyList<M> {
    private Object[] arr;
    private int var;

    public MyArrayList() {
        arr = new Object[5];
        var = 0;
    }

    @Override
    public void add(M data) {
        if (checkBeforeAdd()) {
            arr[var] = data;
            var++;
        }
    }

    @Override
    public void set(int index, M data) {
        if (index >= 0 && index < arr.length) {
            arr[index] = data;
        } else {
            System.out.println("Index Out Of Bound");
        }
    }

    @Override
    public List<M> toList() {
        List<M> list = new ArrayList<>();
        for (Object obj : arr) {
            if (obj != null) {
                list.add((M) obj);
            }
        }
        return list;
    }

    private boolean checkBeforeAdd() {
        if (arr[arr.length - 1] == null) {
            return true;
        } else {
            Object[] arr2 = new Object[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
                System.out.println("arr2 : " + arr2[i]);
            }
            arr = arr2;
            System.out.println("arr1 : " + arr.length);
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(60);

        myList.add(60);
    }
}
