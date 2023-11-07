import java.util.*;
public class listtothis {
    public static void main(String[] args) {

        int[] ben10nis = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> mylist = new ArrayList<>();
        
        for (int i = 0; i < ben10nis.length; i++) {
            mylist.add(ben10nis[i]);
        }
        System.out.println("ArrayList: " + mylist);
    }
}
