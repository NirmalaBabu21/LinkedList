import java.util.LinkedList;

public class BuildinLinklist {

    public static void main(String args[])
    {
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.add("a");
        list.addLast("List");
        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
    
}
