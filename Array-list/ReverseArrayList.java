import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    static void reverseList(ArrayList<Integer> list){
        int i=0, j=list.size()-1;
        while(i<j){
              Integer temp=Integer.valueOf(list.get(i));
              list.set(i,list.get(j));
              list.set(j,temp);
              i++;
              j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(89);
        list.add(56);
        list.add(76);
        list.add(58);
        list.add(44);
        System.out.println("Original List"+list);
          // reverseList(list);
        Collections.reverse(list); // ascending order
         System.out.println("Reversed list"+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reversed list"+list);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Welcome");
         l1.add("to");
          l1.add("My");
           l1.add("Github");
            l1.add("Profile");
        System.out.println("Original String list"+l1);
        Collections.sort(l1);
        System.out.println("Sorted String"+l1);

        Collections.reverse(l1);

        System.out.println("Reversed array list"+l1);
        
      

    }
}
