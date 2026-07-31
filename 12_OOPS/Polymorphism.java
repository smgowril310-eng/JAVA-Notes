//Compile time polymorphism
/**public class Polymorphism {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        System.out.println(p.add(10,20));
        System.out.println(p.add(10,20,30));
    }
}
*/

//Runtime Polymorphism
class Dogs{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Dogs{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Polymorphism {
public static void main(String[] args) {
    Dogs a=new Dog();
    a.sound();
}
}
