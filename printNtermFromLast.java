public class printNtermFromLast 
{
    printNtermFromLast head;
    int data;
    printNtermFromLast next;

    printNtermFromLast(){}
    printNtermFromLast(int data)
    { this.data=data;
    this.next=null;
    }

    public void addFirst(int data)
    { printNtermFromLast newNode= new printNtermFromLast(data);
      if(head==null)
      {head=newNode;
    return;}
      newNode.next=head;
      head=newNode;
    }
    public void addLast(int data)
    { printNtermFromLast newNode= new printNtermFromLast(data);
        if(head==null)
        { head=newNode;}
      printNtermFromLast currNode= head;
      while(currNode.next!=null)
      {currNode=currNode.next;}
      currNode.next=newNode;
      currNode=newNode;
    }

    public void printNode()
    { if(head==null)
    System.out.println("Empty list");
    printNtermFromLast currNode=head;
    while(currNode!=null)
    {
     System.out.print(currNode.data+"->");
     currNode=currNode.next;
    }
    System.out.println("null");
}

    public void lastElement(int n)
    { if(head==null)
        return ;
        printNtermFromLast currNode=head;
        int size=0;
        while(currNode!=null)
        {currNode=currNode.next;
        size++;
        }
        int indextoReach= size-n+1;
        int i=1;
        currNode=head;
        while(i<indextoReach)
        { currNode=currNode.next;
            i++;
        }
        System.out.println("Element from last:"+currNode.data);
    }
    public static void main(String args[])
    {
        printNtermFromLast list=new printNtermFromLast();
        list.addFirst(25);
        list.addLast(100);
        list.addFirst(85);
        list.addFirst(56);
        list.addFirst(89);
        list.printNode();
        list.lastElement(3);
    }

    }
