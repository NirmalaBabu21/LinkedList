import java.util.LinkedList;
import java.util.Scanner;

public class deleteGreater {
    public static void main(String args[])
    {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements from 1 to 50");
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {  if(list.get(i)>25)
            {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
    
}
