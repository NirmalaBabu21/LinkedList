public class nNodeFromLast {
    nNodeFromLast head;
    int data;
    nNodeFromLast next;
      nNodeFromLast( int data)
      {
        this.data= data;
        this. next=null;
      }
      nNodeFromLast()
      {

      }
    public void addFirst(int data)
    { nNodeFromLast newNode= new nNodeFromLast(data);
        if(head==null)
        {
            head=newNode; 
            return;
        }
        newNode.next=head;
        head=newNode;   
    }

    public void printList()
    {
        if (head==null)
        {System.out.println("The list is empty");}

        nNodeFromLast currNode=head;
        while(currNode!=null)
        {  System.out.println(currNode.data);
           currNode=currNode.next;
        }
        
    }
    public nNodeFromLast  NfromLast( int n)
    { if(head.next==null)
        return null;
      int size=0;
      nNodeFromLast currNode=head;
      while (currNode!=null)
      {currNode=currNode.next;
       size++;
      }
      if(n==size)
      {
        return head.next;
      }
      System.out.println("size:"+size);
      int indextoReach= size-n;
      System.out.println("index:"+indextoReach);
      int i=1;
      currNode=head;
      while(i<indextoReach)
      { currNode=currNode.next;
        i++;
      }
      currNode.next=currNode.next.next;
    return head;
    }

    public static void main(String args[])
    {  nNodeFromLast list=new nNodeFromLast();
       list.addFirst(25);
       list.addFirst(5);
       list.addFirst(28);
       list.addFirst(52);
       list.addFirst(856);
       list.printList();
       System.out.println("After deletion");
       nNodeFromLast l1 =new nNodeFromLast();
       l1.head=list.NfromLast(5);
       l1.printList();
       
    }
}
