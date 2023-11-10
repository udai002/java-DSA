import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // creating hashset
        HashSet<Integer> set = new HashSet<>();

        //insert 
        set.add(1);
        set.add(6);
        set.add(4);
        set.add(3);

        if(set.contains(1)){
            System.out.println("set contains 1");

        }else{
            System.out.println("Not found");
        }

        //Remove
        set.remove(1);


        if(set.contains(1)){
            System.out.println("set contains 1");

        }else{
            System.out.println("I think 1 was removed");
        }
        // size
        System.out.println("the Size of the set : "+ set.size());

        //peek  --            
        System.out.println(set);


        //iterator 
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
