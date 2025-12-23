import java.util.ArrayList;
public class Basics {
    
    public static void main(String[] args) {
        // wrapper class
    // Integer i=Integer.valueOf(4);
    // System.out.println(i);

    // Declaration of array list
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Boolean> l2=new ArrayList<>();

    // add new element
    l1.add(5);
    l1.add(6);
    l1.add(7);

    // get an elememt at index i
    System.out.println(l1.get(1)); // 6

    // print with loop
    for(int i=0;i<l1.size();i++){
       System.out.println(l1.get(i)); // 5,6,7
    }
    // print array list  directly
    System.out.println(l1);

    // adding elememt directly

    l1.add(1,100);
    System.out.println(l1);
    // modifing the element at index

    l1.set(1, 89);
    System.out.println(l1);

    // removing the elememt at anu index i

    l1.remove(1);
    System.out.println(l1);

    // removing an elememt
    l1.remove(Integer.valueOf(5));
    System.out.println(l1);

    // checking if elememt exist

    boolean ans=l1.contains(Integer.valueOf(60));
    System.out.println(ans);

    // if you dont specify class,you can put anything inside it
    ArrayList l=new ArrayList<>();
    l.add(3);
    l.add("Harsh");
    l.add(true);
    System.out.println(l);









    }
}
