//Relationship:
/** Relationship defines how one class is connected or associated with another class
 * 
 * Types:
 *  1.Is A Relationship(inheritance)
 *  2.Has A Relationship(association)
 * 
 * Association:
 *  Association is a relationship where one class is connected to another class
 * 
 * Types:
 *  1.Aggregation:
 *  Aggregation is a weak relationship
 *  The child object can exist even if the parent object is destroyed
 * 
 *  2.Composition:
 *   Composition is a Strong relationship
 *   If the Parent object is destroyed,the child object is also destroyed
 * 
 */

 //Aggregation
/** class College{
    String CollegeName ="ABC College";
 }
 class Student{
    College c;
    Student(College c){
        this.c = c;
    }
    void display(){
        System.out.println(c.CollegeName);
    }
 }
public class Relationship {
    public static void main(String[] args) {
        College c=new College();
        Student s=new Student(c);
        s.display();
    }
}
*/

//Composition
class Engine{
    void Start(){
        System.out.println("Engine Started");
    }
}
class Car{
    private Engine engine = new Engine();
    void drive(){
        engine.Start();
        System.out.println("Car is Running");
    }
}
public class Relationship {
public static void main(String[] args) {
 Car c = new Car();
c.drive();
}
}