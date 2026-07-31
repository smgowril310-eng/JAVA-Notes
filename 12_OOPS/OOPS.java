//OOPs:
/** Object oriented Programming(OOP)  is a programming paradigm that uses classes and objects to design and develop software
 *  It organizes data and methods into object making programs reusable,secure,modular and easy to maintain
 * 
 * OOPS Types:
 *  1.Class:
 *    A class is a blueprint for creating object
 * 
 *  2.Object:
 *   An object is an instance of a class
 * 
 *  3.Encapsulation:
 *    Encapsulation is the process of wrapping data(variables) and methods into a single unit(class) and protecting the data using private access
 *    
 * Types:
 *  1.Write only Encapsulation:
 *    only write the data using the setter method
 * 
 *  2.Read only Encapsulation:
 *    only read the data using the getter method
 * 
 *  3.write and read Encapsulation:
 *   Data can be written using a setter and read using a getter
 * 
 *  4.inheritance:
 *   Inheritance is the process by which one class acquires the properties and methods of another class
 *   It promotes code reusability
 *   
 * Types:
 *  1.Single inheritance:
 *    One child class inherits from one parent class
 * 
 *  2.Multilevel inheritance:
 *   A class inherit from another class which is already inherited from another class
 * 
 *  3.Hierarchical inheritance:
 *   Multiple child classes inherit from a single parent class
 * 
 *  4.Multiple inheritance:
 *    One class inherits from more than one parent class
 *    Java does not support this with class but it supports it using interface
 * 
 *  5.Hybrid inheritance:
 *    A combination of two or more types of inheritance
 *    Java support it only through interfaces
 *    
 *  5.polymorphism:
 *  Polmorphism is the ability of one method or object to take many forms
 *  It allows the same name method to perform different task
 * 
 * Types:
 *  1.Compile time polymorphism(Method overloading):
 *    Compile time polymorphism is achieved by method overloading,where method have the same name but different Paramters
 * 
 *  2.Runtime polymorphism(Method Overriding):
 *    Runtime polymorphism is achieved by method overriding ,where a child class overrides a parent class methods
 * 
 *  6.Abstraction:
 *    Abstraction is the process of hiding implementation details and showing only the essential features of an object
 *    
 *   Types:
 *    1.Abstract class:
 *     An abstract class is a class that contains abstract methods(without a body) and concrete methods(with a body)
 *     It can not be instantiated (object cannot be created)
 *    
 *    2.Interface:
 *      An Interface is a blueprint of a class
 *      It contains method declarations and the implementing class provides the method body
 * 
 * Four pillars (Principles) of oops:
 *  1.Encapsulation
 *  2.inheritance
 *  3.polymorphism
 *  4.Abstraction
 */

 //class and object
public class OOPS {
    String name ="Gowri";
    int age = 20;
 public static void main(String[] args) {
    OOPS obj=new OOPS();
    System.out.println(obj.name);
    System.out.println(obj.age);
 }
}
