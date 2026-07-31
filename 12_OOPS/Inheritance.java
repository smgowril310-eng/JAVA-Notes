//Single inheritance:
/**class Animal{
    void Sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class Inheritance {
public static void main(String[] args) {
    Dog d=new Dog();
    d.bark();
    d.Sound();
}
}
*/

//Multilevel inheritance:
/**class Animal{
    void Sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void play(){
        System.out.println("Puppy plays");
    }
}
public class Inheritance {
public static void main(String[] args) {
    Puppy d=new Puppy();
    d.play();
    d.bark();
    d.Sound();
    
}
}
*/

//Hierarchical inheritance
/**class Animal{
    void Sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    }
}
public class Inheritance {
public static void main(String[] args) {
    Dog d=new Dog();
    d.bark();
    d.Sound();
    Cat c=new Cat();
    c.meow();
    c.Sound();
}
}
*/

//Multiple inheritance
/**interface Father{
  void fatherproperty();
}
interface Mother{
    void motherproperty();
}
class Child implements Father,Mother{
    public void fatherproperty(){
        System.out.println("Father's Property");
    }
    public void motherproperty(){
        System.out.println("Mother's Property");
    }
}
    public class Inheritance {
    public static void main(String[] args) {
        Child c=new Child();
        c.fatherproperty();
        c.motherproperty();
    }
 }
*/

//Hybrid inheritance
interface Animal{
    void eat();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog eats");
    }
}
interface Pet{
    void play();
}
class Puppy extends Dog implements Pet{
    public void play(){
        System.out.println("Puppy plays");
    }
}
public class Inheritance {
public static void main(String[] args) {
    Puppy p =new Puppy();
    p.eat();
    p.play();
}
}
 