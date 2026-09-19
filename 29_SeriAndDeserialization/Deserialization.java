//Deserialization:
/**Deserialization is the process of converting a byte Stream back into a java object
 * 
 * Methods:
 * FileInputStream()
 * ObjectInputStream()
 * 
 * Works:
 * 1.Open the file-FileInputStream reads the serialized file
 * 2.Create ObjectInputStream-Reads serialized objects
 * 3.Call readObject()-Converts the byte Stream into an Object
 * 4.Type cast-(Student)converts the returned object to Student
 * 5.Access data-read the Student's ID and name
 */

 import java.io.FileInputStream;
 import java.io.ObjectInputStream;
 import java.io.Serializable;
class Student implements Serializable{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class  Deserialization {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student s=(Student)ois.readObject();
            System.out.println("Student ID: "+s.id);
            System.out.println("Student name: "+s.name);
            ois.close();
            fis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
