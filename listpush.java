 class listO {
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
        Node new_Node= new Node(new_data);
        new_Node.next=head;
        head=new_Node;

     }
     public  void  insertAfter(Node pre_node,int new_data){
         Node new_Node= new Node(new_data);
         if(pre_node == null){
             System.out.println("can,t null");
             return;

         }
         new_Node.next=pre_node.next;
         pre_node.next=new_Node;


     }
     public void append(int new_data){
         Node new_Node=new Node(new_data);
         if(head==null) {
             head = new Node(new_data);
             return;
         }


           new_Node  .next = null;

         Node last=head;
         while (last!=null){
             last=last.next;


         }
         last.next=new_Node;

     }
     public void printlist(){
         Node tnode =head;
         tnode=head;
         while(tnode!=null){
             System.out.print(tnode.data+" ");
             tnode=tnode.next;

         }
     }
     public static void main (String args[]){
         listO llist=new listO();
         llist.append(98);
         llist.push(78);
         llist.push(90);
         llist.insertAfter(llist.head.next,8);
         System.out.println(
                 "LINKED LIST"
         );
         llist.printlist();


     }


}
