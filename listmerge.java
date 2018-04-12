public class listmerge {
    node head = null;

    static class node {
        int val;
        node next;

        node(int val) {
            this.val=val;


        }
    }
    node sortedmerge(node a, node b) {
        node result = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val < b.val) {
            result = a;
            result.next = sortedmerge(a.next, b);

        }
        if (a.val > b.val) {
            result = b;
            result.next = sortedmerge(a, b.next);
        }

        return result;
    }


  node mergesort( node h) {
    if (h == null || h.next == null) {
        return h;

    }
    node middle = getmiddle(h);
    node nextofmiddle = middle.next;
    middle.next = null;
    node left =mergesort(h) ;
    node right = mergesort(nextofmiddle);
    node sorted = sortedmerge(left, right);
    return sorted;
}
node getmiddle(node h) {
    if (h == null) {
        return h;
    }
    node leftptr = h;
    node rightptr = h.next;
    while (rightptr != null) {
        rightptr = rightptr.next;
        if (rightptr != null) {
            rightptr = rightptr.next;
            leftptr = leftptr.next;
        }

    }
    return leftptr;
}
  void push(int new_data) {
    node new_node = new node(new_data);
    new_node.next = head;
    head = new_node;
}



    void printList(node headref)
    {
        while (headref != null)
        {
            System.out.print(headref.val + " ");
            headref = headref.next;
        }
    }
    public static void  main(String[] args){
    listmerge li=new listmerge();
    li.push(2);
    li.push(9);
    li.push(5);
    li.push(8);
    li.push(1);
    li.push(10);
    li.printList(li.head);
    li.head=li.mergesort(li.head);
    li.printList(li.head);

    }
}




