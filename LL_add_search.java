import java.util.*;

public class LL_add {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("5");
        list.add("7");
        list.add("3");
        list.add("8");
        list.add("2");
        list.add("3");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.contains("7")) {
                System.out.println(list.indexOf("7"));
                break;
            }
        }

    }

}
