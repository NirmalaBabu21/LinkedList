public class reverseList {
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

public void reverseIterate() {
    if(head == null || head.next == null) {
        return;
    }


    Node prevNode = head;
    Node currNode = head.next;
    while(currNode != null) {
        Node nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
    }
    head.next = null;
    head = prevNode;
}

public static void main(String args[])
{
    reverseList a1=new reverseList();
    a1.printNode();
    a1.addFirst("hi");
    a1.printNode();
    a1.addFirst("hello");
    a1.printNode();
    a1.addLast("bye");
    a1.printNode();
    a1.addFirst("This");
    a1.printNode();
    a1.reverseIterate();
    a1.printNode();
}
}

