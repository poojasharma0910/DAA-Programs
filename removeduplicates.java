
class removeduplicates {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            int data=d;
            next=null;
        }

    }
     void duplicates(){
        Node current=head;
        Node next_next;
        if(head==null)
            return;

        while (current.next!=null){
            if(current.data==current.next.data){
                next_next=current.next.next;
                current.next=null;
                current.next=next_next;

            }
            else
                current=current.next;


        }

    }
     void push(int new_data){
        Node new_node=new Node( new_data);
        new_node.next=head;
        head=new_node;
    }
    void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
    }
    public static void main (String args[]){
        removeduplicates llist=new removeduplicates();
        llist.push(80);
        llist.push(12);
        llist.push(10);
        llist.push(8);
        llist.push(8);
        llist.printlist();
        System.out.println("after deleton");
        llist.duplicates();
        llist.printlist();


    }
}
