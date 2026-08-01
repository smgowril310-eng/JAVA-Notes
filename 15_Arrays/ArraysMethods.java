//Array Methods:
/**1.Print:
 * prints the array
 *  Arrays.toString()
 * 
 * 2.Order:
 * Sort the array in ascending order
 * Arrays.sort()
 * 
 * 3.Order start and End Index:
 * Sorts only a specified range
 * Arrays.sort(arrayname,fromIndex,toIndex)
 * 
 * 4.search:
 * search an elements in a sorted array
 * Arrays.binarySearch(arrayname,search value)
 * 
 * 5.copy:
 * copies the Array
 * copyOf()
 * 
 * 6.copy from to:
 *  copies elements from one index to another
 * copyOfRange(arrayname,fromIndex,toIndex)
 * 
 * 7.Equals:
 * check whether two arrays are equals
 * Arrays.equals()
 * 
 * 8.compare:
 * compare two arrays lexicographically
 * Arrays.compare()
 * 
 * 9.Mismatch:
 * Returns  the first different index
 * Arrays.mismatch()
 * 
 * 10.Fill:
 * Fills all elements with the same value
 * Arrays.fill()
 * 
 * 11.Fill from to:
 * Fills a specified range with the same value
 * fill(Arrayname,fromIndex,toIndex,value)
 * 
 */

 import java.util.Arrays;
public class ArraysMethods {
    public static void main(String[] args) {
        int[] a = {10,20,30,50,80,70,60};
        Arrays.sort(a);//sort
        System.out.println(Arrays.toString(a));
        Arrays.sort(a,2,4);//sort()
        System.out.println(Arrays.toString(a));//print
        System.out.println(Arrays.binarySearch(a,30));//search
        int[] b = Arrays.copyOf(a, 5);//copy
         System.out.println(Arrays.toString(b));
          int[] c = Arrays.copyOfRange(a, 2,5);//copy()
         System.out.println(Arrays.toString(c));
         System.out.println(Arrays.equals(a,b));//equal
         System.out.println(Arrays.compare(a,b));//compare
         System.out.println(Arrays.compare(a,c));
         System.out.println(Arrays.mismatch(a,b));//mismatch
         Arrays.fill(a,10);
         System.out.println(Arrays.toString(a));//fill
         Arrays.fill(b,2,5,6);
         System.out.println(Arrays.toString(b));//fill()
    }
}
