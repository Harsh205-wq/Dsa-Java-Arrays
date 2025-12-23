import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
          ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(89);
        list.add(56);
        list.add(76);
        list.add(58);
        list.add(44);
        System.out.println("Original List"+list);
        Collections.sort(list);
        System.out.println("Sorted list"+list);
    }
}
