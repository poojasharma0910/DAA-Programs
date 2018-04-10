

public class listD {
    Node head;


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void delete(int key) {
        Node temp = head, pre = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            pre = temp;
            temp = temp.next;

        }
        if (temp == null) {
            return;
        }
        pre.next = temp.next;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }

     void printlist() {
        Node tnode = head;

        while (tnode != null) {
            System.out.println(tnode.data + "");
            tnode = tnode.next;
        }
    }

    public static void main(String args[]) {
        listD llist = new listD();
        llist.push(8);
        llist.push(9);
        llist.push(78);
        llist.push(18);
        llist.delete(78);
        llist.printlist();
    }
}
