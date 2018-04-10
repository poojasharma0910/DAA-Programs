 class listPD {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push( int new_data){
        Node new_node =new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void position(int pos){
        if(head ==null){
            return;
        }
        if(pos==0){
            head=head.next;
            return;

        }
        Node temp=head;
        for(int i=0; temp!=null && i< pos-1;i++){
            temp=temp.next;
        }
        if(temp==null ||temp.next==null){
            return;
        }
        Node next =temp.next.next;
        temp.next=next;


    }
    public  void print()
     {
         Node tnode = head;
         while (tnode != null)
         {
             System.out.print(tnode.data+" ");
             tnode = tnode.next;
         }
     }
    public static void main (String args[]){
        listPD llist=new listPD();
        llist.push(8);
        llist.push(89);
        llist.push(96);
        llist.push(67);
        llist.position(3);
        llist.print();
    }

}
