public class DetectAndRemoveLoop {
    DetectAndRemoveLoop head;
    int data;
    DetectAndRemoveLoop next;
    DetectAndRemoveLoop(){}
    DetectAndRemoveLoop(int data){
        this.data=data;
        this.next=null;
    }
    public void addFirst(int data){
        DetectAndRemoveLoop newNode=new DetectAndRemoveLoop(data);
        if(head==null){
        head=newNode;return;}
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        DetectAndRemoveLoop newNode=new DetectAndRemoveLoop(data);
        if(head==null)
        {head=newNode;return;}
        DetectAndRemoveLoop  currNode=head;
        while(currNode.next!=null)
        currNode=currNode.next;
        currNode.next=newNode;
        currNode=newNode;
    }
    public void printList(){
        if(head==null)
        {System.out.println("Empty list");return;}
        DetectAndRemoveLoop currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public DetectAndRemoveLoop createLoop(int n,DetectAndRemoveLoop head )
    { int i=1;
        DetectAndRemoveLoop currnode=head;
        while(i<n){
            currnode=currnode.next;
            i++;
        }
        DetectAndRemoveLoop d=currnode;
        while(currnode.next!=null)
        currnode=currnode.next;
        currnode.next=d;
        return head;
    }
    public Boolean detectLoop()
    {  DetectAndRemoveLoop fast=head;
       DetectAndRemoveLoop slow=head;
       while(fast.next!=null && fast.next.next!=null)
       { fast= fast.next.next;
         slow=slow.next;
         if(fast == slow)
         {
         return true;}
       }
       return false;
    }
    
    public void  remove (){
       DetectAndRemoveLoop fast=head;
       DetectAndRemoveLoop slow=head;
       int k=1;
       while(fast.next!=null && fast.next.next!=null)
       { fast= fast.next.next;
         slow=slow.next;
         if(fast == slow)
         break;
       } if (fast==slow)
         {  
            while(fast.next!=slow)
            {k++;
            fast=fast.next;}
        DetectAndRemoveLoop p1=head;
        DetectAndRemoveLoop p2=head;
        while(k>0)
        {
            p2=p2.next;
            k--;
        }
        while(p1.next!=p2.next){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=null;
        return;
    }}
    public static void main(String args[])
    {
        DetectAndRemoveLoop list=new DetectAndRemoveLoop();
        list.addFirst(50);
        list.addFirst(85);
        list.addFirst(30);
        list.addLast(63);
        list.addLast(96);
        list.addFirst(0);
        list.printList();
        boolean a=list.detectLoop();
        if(a)
        System.out.println("Loop");
        else
        System.out.println("No Loop");
        DetectAndRemoveLoop l1=new DetectAndRemoveLoop();
        System.out.println("Creating loop");
        l1.head=list.createLoop(4, list.head);
        boolean b=l1.detectLoop();
        if(b)
        System.out.println("Loop created");
        else
        System.out.println("No Loop created");
        System.out.println("Remove Loop");
        DetectAndRemoveLoop r=new DetectAndRemoveLoop();
        l1.remove();
        boolean c=l1.detectLoop();
        if(c)
        System.out.println("No Loop removed");
        else
        System.out.println("Loop removed");
        l1.printList();
    }
}
