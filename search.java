import java.util.LinkedList;

public class search {
    public static void main(String args[])
    { //1, 5, 7, 3 , 8, 2, 3
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==7)
            System.out.println("The index at whihc 7 is present: "+ i);
        }

    }
    
}
