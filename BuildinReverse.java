import java.util.*;

public class BuildinReverse {

public static void main (String args[])
{
    LinkedList<String> a1=new LinkedList<String>();
    a1.addFirst("a");
    System.out.println(a1);
    a1.addFirst("is");
    System.out.println(a1);
    a1.addLast("list");
    System.out.println(a1);
    Collections.reverse(a1);
    System.out.println(a1);
}
}


