//Serialization:
/**Serialization is the process of converting an object into a byte stream so that it can be stored in a file or transferred over a network
 * 
Methods:
FileOutputStream
ObjectOutputStream

Work:
1.Create an Object-Student S
2.Implement Serializable-Allows the object to be serialized
3.Create ObjectOutputStream-Used to write the Object
4.Calll writeObject()-converts and writes the object 
5.Close the Stream-Finishes the writing process */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class Serialization {
    public static void main(String[] args) {
        Student s=new Student(101, "Gowri");
        try{
            FileOutputStream fos=new FileOutputStream("student.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();
            System.out.println("Serialization completed");
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }

//transient:
/**The transient keyword is used to prevent a variable from being serialized during serialization
 * 
 * Syntax:
 * transient datatype variableName;
 */