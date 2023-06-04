public class DetectingCycle {
    DetectingCycle head;
    String data;
    DetectingCycle next;
    DetectingCycle(){}
    DetectingCycle(String data)
    {   this.data=data;
        this.next=null;
    }

    public void addFirst(String data){
        DetectingCycle newNode=new DetectingCycle(data);
        if(head==null){
            head=newNode;return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        DetectingCycle newNode=new DetectingCycle(data);
        if (head==null){
            head=newNode; 
        }
        DetectingCycle currNode=head;
        while(currNode.next!=null)
        currNode=currNode.next;
        currNode.next=newNode;
        currNode=newNode;
    }

    // public DetectingCycle  Loop ( int n)
    // { 
    //   int i=1;
    //   DetectingCycle newNode=head;
    //   while(i<n)
    //   { newNode=newNode.next;
    //     i++;
    //   }
    //   DetectingCycle d=newNode;
    //   while(newNode.next!=null)
    //   newNode=newNode.next;
    //   newNode.next=d;
    // return head;
    // }

    public void printList(){
        if(head==null)
        System.out.println("The list is empty");
        DetectingCycle currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public boolean detect(){
        DetectingCycle turtle= head;
        DetectingCycle hair =head;
        while(hair.next!=null && hair.next.next!=null){
            hair=hair.next.next;
            turtle=turtle.next;
        if(hair==turtle)
        return true;
    }
        return false;
    }
    
    public static void main(String args[]){
        DetectingCycle list=new DetectingCycle();
        list.addFirst("m");
        list.addFirst("a");
        list.addFirst("l");
        list.addFirst("a");
        list.addFirst("y");
        list.addFirst("a");
        list.addFirst("l");
        list.addFirst("a");
        list.addFirst("m");
        list.printList();
        //list.Loop(5);
        boolean a=list.detect();
        if(a)
        System.out.println("Loop");
        else
        System.out.println("Not Loop");
    }
}
