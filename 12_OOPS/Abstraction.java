//Abstract class
/**abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class Abstraction {
 public static void main(String[] args) {
    Dog d =new Dog();
    d.sound();
 }   
}
*/

//interface
interface Animal{
    void sound();
}
class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class Abstraction {
public static void main(String[] args) {
    Dog d =new Dog();
    d.sound();
}
}
