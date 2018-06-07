 class Linkedlistmiddle {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
        void printmiddle(){
            Node slow_ptr=head;
            Node fast_ptr=head;
            if(head!=null){
                //*this fast_ptr.next here used because lets take one examples 123456 fast_ptr gets null firstbut we have to reach
                while(fast_ptr!=null && fast_ptr.next!=null){
                    slow_ptr=slow_ptr.next;
                    fast_ptr=fast_ptr.next.next;


                }

            }
            System.out.println("middle element"+ slow_ptr.data);

        }
        public void push(int new_data){
            Node new_node=new Node(new_data);
            new_node.next=head;
            head=new_node;


        }
        public void printlist(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        public static void main(String[] args){
            Linkedlistmiddle llist=new Linkedlistmiddle();


                llist.push(5);
                llist.push(9);
                llist.push(25);
                llist.push(25);
                llist.printlist();
                llist.printmiddle();


    }
}
