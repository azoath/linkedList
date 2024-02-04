// Reverse using recursion
public class LL_reverse_recursion {
    Node head;

    public static void main(String[] args) {
        LL_reverse_recursion list = new LL_reverse_recursion();
        list.listAdd(1);
        list.listAdd(2);
        list.listAdd(3);
        list.listAdd(4);
        list.listAdd(5);

        System.out.println("Current list:");
        list.listprint();

        list.head = list.reverseRecursion(list.head);
        System.out.println("Reversed list:");
        list.listprint();
    }

    public class Node {
        Node next;
        int data;

        Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    public void listAdd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void listprint() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node reverseRecursion(Node head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursion(head.next);

        // Reverse the links
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
