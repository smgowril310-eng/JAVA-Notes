//StringBuilder:
/**StringBuilder is a mutable class
 * Its value can be changed after creation
 * It is not thread safe so it is faster than StringBuffer and non synchronized
 * 
 * deleteCharAt():
 * Deletes one Character
 * 
 * delete():
 * Deletes characters between start and end index
 * 
 * insert():
 * Inserts text at the specified index
 * 
 * replace():
 * Replaces text
 * 
 * reverse():
 * Reverses the StringBuilder
 * 
 * capacity():
 * Returns the capacity
 * 
 * length():
 * Returns the number of characters
 * 
 */
public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Vedisamy");//append
        System.out.println(sb);
         System.out.println(sb.length());//length
        sb.deleteCharAt(2);//deleteCharAt
        System.out.println(sb);
        sb.delete(3, 4);//delete
        System.out.println(sb);
        sb.insert(4, "World");//insert
        System.out.println(sb);
        sb.replace(0,4 , "Python");//replace
        System.out.println(sb);
        sb.reverse();//reverse
        System.out.println(sb);
        System.out.println(sb.capacity());//capacity
    }
}
