//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.*;

public class LL_ques2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            if (input > 50) {
                System.out.println("Invalid input!Warning: Max range->50");
            }
            for (int i = 0; i <= 10; i++) {
                list.add(i, input);

            }

            // while (true) {
            // if (input > 50) {
            // System.out.println("Invalid input!Warning: Max range->50");
            // } else {
            // list.add(input);
            // }

            // }
            System.out.println("original list:" + list);

            // list_Delete(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > 25) {
                    list.remove(i);
                    i--;
                }
            }
            System.out.println("updated list:" + list);
        }
    }

    // public static void list_Delete(LinkedList<Integer> list) {

    // for (int i = 0; i < list.size(); i++) {
    // if (list.get(i) > 25) {
    // list.remove(i);
    // i--;
    // }
    // }

    // }
}
