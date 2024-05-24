package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {

        //list creation
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int size = list.size();
        System.out.println("Size"+ size);
        System.out.println("List : " + list);

        //Iterate list using for loop

//        for(Integer data : list){
//            System.out.println(data);
//        }

        //Using forEach loop

//        list.forEach(data -> {
//            System.out.println(data) ;
//        });

        // Using Iterator

//        Iterator<Integer> iterator = list.iterator();

//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //ListItterator

//        ListIterator<Integer> listIterator = list.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//            System.out.println(listIterator.nextIndex());
//        }

        System.out.println(list.get(0));

        list.remove(5);
        System.out.println("Updated List :" + list);

        list.set(4, 80);
        System.out.println("New List: " + list);

        List<Integer> list2  = new ArrayList<>();
        list2.add(1000);
        list2.add(2000);
        list2.add(3000);

        System.out.println("List 2" + list2);
        list.addAll(list2);

        System.out.println("Added List :" +list);

        System.out.println("List 1 :" + list);
        System.out.println("List 2 :" + list2);
        System.out.println(list2.containsAll(list));

    }
}
