public class looplinkedlist {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int detectAndremoveloop(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                remove(slow, node);
                return 1;
            }

        }
        return 0;
    }

    void remove(Node loop, Node curr) {
        Node ptr1 = null, ptr2 = null;

        ptr1 = curr;
        while (1 == 1) {

            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            if (ptr2.next == ptr1) {
                break;
            }


            ptr1 = ptr1.next;
        }


        ptr2.next = null;
    }


    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {
        looplinkedlist list = new looplinkedlist();
        list.head = new Node(5);
        list.head.next = new Node(2);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);


        head.next.next.next.next.next = head.next.next;
        list.detectAndremoveloop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }
}






