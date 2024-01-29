// whenever we need to perform the manipulation  like insert, add, etc. prefer to use linked list as time complexity of this will be O(1) which is lesser than time complexity of arraylist manipulation i.e.  O(n).

// while performing searching prefer to use arraylist as time complexity for arraylist is O(1) and time complexity of linked list is O(n) as we need to traverse all the indexes to find the searched element.

//Properties of linkedlist:
// variable size
// non- contiguous
// insert- O(1)
// search- O(n)

// node -> data + next(pointer/reference)
// head -> first node
// tail -> last node
// types of linked list 1.singular 2.doubly 3.circular

//import java.util.*;

public class LL {

    node head; // global variable

    public static void main(String[] args) throws Exception {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("this");

        list.listPrint();

        list.addLast("linked");
        list.addLast("list");

        list.listPrint();

        list.deleteFirst();
        list.listPrint();

        list.deleteLast();
        list.listPrint();

    }

    // node formation
    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // adding in the first position
    public void addFirst(String data) {
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // adding in the last position
    public void addLast(String data) {

        node newNode = new node(data);
        node currentNode = head;
        if (head == null) {
            head = newNode;
            return;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;

        }
    }

    // printing the list
    public void listPrint() {
        node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // deleting the first element
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list empty");
            return;
        } else {
            head = head.next;
        }
    }

    // deleting the last element
    public void deleteLast() {
        node currentNode = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else {
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
                currentNode.next = currentNode.next;

            }
            currentNode.next = null;
        }
    }

    // size of linkedList

}
