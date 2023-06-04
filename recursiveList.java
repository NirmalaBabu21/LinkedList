public class recursiveList {
    Node head;
class Node
{
    String data;
    Node next;

    Node(String data)
    {
        this.data=data;
        this.next=null;
    }
}

public void addFirst(String data)
{  Node newNode=new Node(data);
    if(head==null)
    {head=newNode;
    return;
    }
    newNode.next=head;
    head=newNode;
}

public void addLast(String data)
{ Node newNode=new Node(data);
    if(head==null)
    {head=newNode;
    return;
    }
 Node currNode= head;
 while(currNode.next!=null)
 currNode=currNode.next;
 currNode.next=newNode;
 currNode=newNode;
}

public void printNode()
{if(head==null)
    {System.out.println("The list is empty");
    return;
    }
    Node currNode= head;
    while(currNode!=null)
{System.out.print(currNode.data+" ->");
        currNode=currNode.next;
}
System.out.println("NULL");
}

public Node recurse( Node head) {
    if(head == null || head.next == null) {
        return head;
    }
    Node newNode=recurse(head.next);
    head.next.next=head;
    head.next=null;
    return newNode;
}

public static void main(String args[])
{
    recursiveList a1=new recursiveList();
    a1.printNode();
    a1.addFirst("hi");
    a1.printNode();
    a1.addFirst("hello");
    a1.printNode();
    a1.addLast("bye");
    a1.printNode();
    a1.addFirst("This");
    a1.printNode();
   a1.head= a1.recurse(a1.head);
    a1.printNode();
}

}
