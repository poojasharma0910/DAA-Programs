public class LinkedlistmiddleD {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            int data=d;
            Node next;

        }

    }
    public void  LinkedmiddleD() {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head == null) {
            return;
        }
        Node pre=null ;
        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            pre = slow_ptr;
            slow_ptr = slow_ptr.next;
        }
        pre.next = slow_ptr.next;
    }

public  void push(int new_data){
    Node new_node=new Node(new_data);
    new_node.next=head;
    head=new_node;

}
public void  printlist(){
    Node temp=head;
    while (temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
}
public static void main(String[] args){
    LinkedlistmiddleD llist=new LinkedlistmiddleD();
    llist.push(4);
    llist.push(9);
    llist.push(17);
    llist.push(14);
    llist.printlist();
    llist.LinkedmiddleD();
    llist.printlist();



}

}