public class pallindrome {
    pallindrome head;
    String data;
    pallindrome next;
    pallindrome(){}
    pallindrome(String data)
    {   this.data=data;
        this.next=null;
    }

    public void addFirst(String data){
        pallindrome newNode=new pallindrome(data);
        if(head==null){
            head=newNode;return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        pallindrome newNode=new pallindrome(data);
        if (head==null){
            head=newNode; 
        }
        pallindrome currNode=head;
        while(currNode.next!=null)
        currNode=currNode.next;
        currNode.next=newNode;
        currNode=newNode;
    }
    public void printList(){
        if(head==null)
        System.out.println("The list is empty");
        pallindrome currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public pallindrome findMiddle(pallindrome head){
        pallindrome turtle= head;
        pallindrome hair =head;
        while(hair.next!=null && hair.next.next!=null){
            hair=hair.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public pallindrome reverse(pallindrome head){
        pallindrome prev=null;
        pallindrome curr=head;
        while(curr!=null){
            pallindrome nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public boolean pallin(){
        if(head==null||head.next==null)
        return true;
        
        pallindrome middleList=findMiddle(head);
        pallindrome secondHalfList=reverse(middleList.next);
        pallindrome firstHalfList= head;
        while(secondHalfList!=null){
            if((firstHalfList.data) != (secondHalfList.data))
            return false;
            firstHalfList=firstHalfList.next;
            secondHalfList=secondHalfList.next;
        }
        return true;
    }
    public static void main(String args[]){
        pallindrome list=new pallindrome();
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
        boolean a=list.pallin();
        if(a)
        System.out.println("Pallindrome");
        else
        System.out.println("Not Pallindrome");
    }
}
