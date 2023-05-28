public class delete 
{ NodeList head;
  private int size;
  delete()
  {
    this.size=0;
  }
    class NodeList
    {
        String data;
        NodeList next;

        NodeList(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data)
{  NodeList newNode=new NodeList(data);
    if(head==null)
    {head=newNode;
    return;
    }
    newNode.next=head;
    head=newNode;
}

    public void deleteFirst()
    { 
        if(head==null)
        {
            System.out.println("This is a empty list, nothing to delete!!");
            return;
        }
      head=head.next;
      size--;
    }

    public void deleteLast()
    { 
      if (head==null)
      {System.out.println("The List is empty, nothing to delete!!!");
       return;
      }
      size--;
      if(head.next==null)
      {head=null;
       return; 
      }
      NodeList secondLast=head;
      NodeList lastNode=head.next;
      while(lastNode.next!=null)
      { lastNode=head.next;
        secondLast=secondLast.next;
      }
      secondLast.next=null;
    }

    public void printNode()
    { if (head==null)
        {System.out.println("The List is empty");
         return;
        }
        NodeList currNode= head;
        while(currNode!=null)
    {System.out.print(currNode.data+" ->");
            currNode=currNode.next;
    }
    System.out.println("NULL");
    }
    public int getSize()
    {return size;}

    
    public static void main(String args[])
    {
        delete a1=new delete();
        a1.printNode();
        a1.addFirst("hello");
        a1.printNode();
        a1.addFirst("a");
        a1.printNode();
        a1.addFirst("is");
        a1.printNode();
        a1.deleteFirst();
        a1.printNode();
        a1.deleteLast();
        a1.printNode();
        System.out.println(a1.getSize());
        a1.addFirst("Bye bye");
        a1.printNode();
        System.out.println(a1.getSize());
    }
    
}
