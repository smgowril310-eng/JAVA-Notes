//SingletonClass:
/**A Singleton class is a class that allows only one object (instance) to be created throughout the application. */

class Singleton {

    // 1. Create a static object
    private static Singleton obj;

    // 2. Private constructor
    private Singleton() {
        System.out.println("Object Created");
    }

    // 3. Static method to get the object
    public static Singleton getInstance() {

        if (obj == null) {
            obj = new Singleton();
        }

        return obj;
    }

    void display() {
        System.out.println("Singleton Class");
    }
}

public class SingletonClass {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.display();

        System.out.println(s1 == s2);
    }
}

    

