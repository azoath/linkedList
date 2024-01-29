// linkedList by collection Framework

import java.util.*;

public class LL_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("this");

        System.out.println(list);

        list.addLast("a");
        System.out.println(list);

        list.add("list"); // add() by default adds in the last
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.remove(); // remove() by default deletes the first element
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
}
