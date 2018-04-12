public class circularO {
    public int  size=0;
   public Node head =null;
   public Node tail=null;
   class Node{
        int data;
        Node next;
    public Node(int data){
            this.data = data;
        }
    }

    public void addatstart(int data){
       Node n=new Node(data);
        if(size==0){
            head=n;
            tail=n;
            n.next=head;
        }
        else{
            Node temp=head;
            head=n;
            head.next =temp;
            tail.next=n;

        }
        size++;
    }
    public void atend(int data){
        Node n=new Node(data);
        if(size==0){
            addatstart(data);
        }else{
            tail.next=n;
            tail=n;
            tail.next=head;


        }
        size++;
    }
    public void del(){
        if(size==0){
            System.out.println("empty");
        }
        else{
            head=head.next;
            tail.next=head;
            size--;
        }

    }
    public int elementAt(int index){
        if(index>size){
            return -1;
        }
        Node n = head;
        while(index-1!=0){
            n=n.next;
            index--;
        }
        return n.data;
    }
    public void print(){
        System.out.print("Circular Linked List:");
        Node temp = head;
        if(size<=0){
            System.out.print("List is empty");
        }else{
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
            while(temp!=head);
        }
        System.out.println();
    }public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        circularO c = new circularO();
        c.addatstart(3);
        c.addatstart(2);
        c.addatstart(1);
        c.print();
        c.atend(4);
        c.print();
        c.atend(4);
        c.print();
        System.out.println("Size of linked list: "+ c.getSize());
        System.out.println("Element at 2nd position: "+ c.elementAt(2));
    }

}
