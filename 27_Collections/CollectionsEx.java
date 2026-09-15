//Collections:
/**Collections is a utility class in java's java.util package.
 * It provides static methods to perform operations on Collections,especially lists.
 * 
 * Methods:
 * sort(list)->Sorts elements in ascending order
 * sort(list,comparator)->Sort a list in a custom order
 * reverse(list)->Reverse the list
 * shuffle(list)->Randomly changes the order
 * swap(list,index,index2)->swaps two elements
 * min(list)->Returns the minimum element
 * max(list)->Returns the maximum element
 * frequency(collection,obj)->Counts how many times an element occurs
 * replaceAll(list,oldvalue,newvalue)->Replaces an old value with a new value
 * fill(list,obj)->Replaces every element with the given value
 * copy(dest,src)->Copies elements from the source list to the destination list
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CollectionsEx{
public static void main(String[]args){
    List<String> al=Arrays.asList("Bana","Apple","Mango","Cherry");
    System.out.println(al);
    Collections.sort(al);
    System.out.println("after sorting:"+al);
    Collections.reverse(al);
    System.out.println("Reverse:"+al);
    Collections.shuffle(al);
    System.out.println("Shuffle:"+al);
    Collections.swap(al,0,1);
    System.out.println("Swap:"+al);
   System.out.println("Min:"+Collections.min(al));
   System.out.println("Max:"+Collections.max(al));
   System.out.println("freq:"+Collections.frequency(al,"Apple"));
   Collections.replaceAll(al,"Apple","Orange");
   System.out.println("Replace:"+al);
   Collections.fill(al,"Fruit");
   System.out.println("Fill:"+al);
}
}