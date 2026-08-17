//File Handling:
/**File Handling is the process of creating,reading,writing,updating and deleting files in java
 * 1.File Class:
 *  The File class is used to create,delete and check the existence of a file or folder
 * 
 * 2.File Reader:
 *  File Reader is used to read data from a text file
 * 
 * 3.File Writer:
 *  File Writer is used to write data into a file
 * 
 * 4.Buffered Reader:
 *  Buffered Reader is used to read data efficiently by buffering characters
 * 
 * 5.Buffered Writer:
 *  Buffer Writer is used to write data efficiently by buffering characters
 * 
 * Methods:
 * 1.createNewFile():
 *  creates a new file
 * 2.exists():
 *  Checks whether the file exists
 * 3.delete():
 * Deletes the file
 * 4.getName():
 * Returns the file name
 * 5.getAbsolutePath():
 *  Returns the complete file path
 * 6.canRead():
 *  Checks whether the file can be read
 * 7.canWrite():
 * Checks whether the file can be written
 * 8.length():
 *  Returns the size of the file in bytes
 * 9.read():
 * Reads one character from the file
 * 10.write():
 * Writes data into a file
 * 11.readLine():
 * Reads one line at a time
 * 12.newLine():
 * writes a new line
 * 13.canExecute():
 * check whether the file or program has execute permission
 * 
 */

//File class
/**import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("student.txt");
        if(file.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File Already Exists");
        }
    }
}
*/

//File writer
/**import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
public static void main(String[] args)throws IOException {
    FileWriter fw=new FileWriter("student.txt");
    fw.write("Hello Gowri");
    fw.close();
    System.out.println("Data written Successfully");
}
}
*/

//File Reader
/**import java.io.FileReader;
import java.io.IOException;
public class FileHandling {
public static void main(String[] args)throws IOException {
    FileReader fr = new FileReader("student.txt");
    int ch;
    while ((ch = fr.read())!=-1) {
        System.out.println((char)ch);
    }
    fr.close();
}
}
*/

//BufferedReader
/**import java.io.*;
public class FileHandling {
public static void main(String[] args)throws IOException{
   BufferedReader br=new BufferedReader(new FileReader("student.txt"));
   String line;
   while ((line = br.readLine())!= null) {
    System.out.println(line);
   } 
   br.close();
}
}
*/

//Buffered Writer

/**import java.io.File;
import java.io.*;
public class FileHandling {
public static void main(String[] args)throws IOException {
BufferedWriter bw=new BufferedWriter(new FileWriter("student.txt"));
bw.write("Hello Vedisamy");
bw.close();
System.out.println("Data Written successfully");
}
}
*/

//Methods
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling{
    public static void main(String[] args)throws IOException {
        File file = new File("Student.txt");
        file.createNewFile();
        System.out.println("Exist: " +file.exists());
        System.out.println("Name: "+file.getName());
        System.out.println("Path: "+file.getAbsolutePath());
        System.out.println("can Read: "+file.canRead());
        System.out.println("can Write: "+file.canWrite());
        System.out.println("can Execute: "+file.canExecute());
        System.out.println("Length: "+file.length());
        FileWriter fw=new FileWriter(file);
        fw.write("Hello Gowri \n Java Full Stack");
        fw.close();
        FileReader fr = new FileReader(file);
        int ch;
        System.out.println("\n Using read():");
        while((ch = fr.read())!=-1){
        System.out.println((char)ch);
        }
        fr.close();
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println("\n Using BufferedReader:");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        bw.write("java");
        bw.newLine();
        bw.write("Springboot");
        bw.close();
    }
}