//compareTo():
/**compareTo() is used to compare two objects and determine their natural order.
It returns `0` if both are equal, a negative value if the first is smaller, and a positive value if the first is greater.
*/
//simple example:
// public class Compare {
//     public static void main(String[] args) {
//         String a = "Apple";
//         String b = "Apple";

//         int result = a.compareTo(b);

//         System.out.println(result);
//     }
// }
 
//Comparable:
/** Comparable is an interface in Java used to define the natural/default sorting order of objects.
 * It has single abstract
*/
// import java.util.ArrayList;
// import java.util.Collections;
// public class Compare implements Comparable<Compare>{
//     Integer id;
//     String name;
//     String job;
//     Compare(Integer id,String name,String job){
//         this.id=id;
//         this.name=name;
//         this.job=job;
//     }
//     //public int compareTo(Compare ob){
//         // if(id<ob.id)
//         // return 1;
//         // else if(id>ob.id)
//         // return -1;
//         // else
//         // return 0;
//         @Override
// public int compareTo(Compare ob) {

//     int result = ob.id.compareTo(id);

//     if (result == 0) {
//         return name.compareTo(ob.name);
//     }

//     return result;
// }
//    // }
//     @Override 
//     public String toString(){
//         return "Compare[id="+id+",name="+name+";job="+job+"]";
//     }
//     public static void main(String[]args){
//         ArrayList<Compare>al=new ArrayList<>();
//         al.add(new Compare(2, "Kanish", "Police"));
//         al.add(new Compare(1,"Arun","Software"));
//         al.add(new Compare(3,"Harshitha","Tester"));
//         System.out.println(al);
//         Collections.sort(al);
//         for(Compare u:al){
//             System.out.println(u);
//         }
//     }
// }

//Comparator:
/**Comparator is an interface in Java used to define a custom sorting order for objects. */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Userclass{
    Integer id;
    String name;
    String job;
    Userclass(Integer id,String name,String job){
        this.id=id;
        this.name=name;
        this.job=job;
    }
    @Override 
    public String toString(){
        return "Compare[id="+id+",name="+name+";job="+job+"]";
    }
public class Compare implements Comparator<Userclass>{
public int compare(Userclass ob,Userclass ob1){
    return ob.id.compareTo(ob1.id);
}
public static void main(String[]args){
    ArrayList<Userclass> al=new ArrayList<Userclass>();
    al.add(new Userclass(2,"Kanish","Police"));
    al.add(new Userclass(1,"Arun","Software"));
    al.add(new Userclass(3,"Harshitha","Tester"));
        System.out.println(al);
       // Collections.sort(al,new Compare());
        for(Userclass u:al){
            System.out.println(u);
        }
    }
}
}
