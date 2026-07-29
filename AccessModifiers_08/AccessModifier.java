//Access Modifiers:
/**Access Modifiers are keywords that control the visibility of classes,methods,variables and constructors
 *
 * Types:
 * 1.Public:
 *  A Public member can be accessed from anywhere
 * 
 * 2.Private:
 *  A Private member can be accessed only inside the same class
 * 
 * 3.Protected:
 *  A Protected member can be accessed in the same Package and by subclasses
 * 
 * 4.Default:
 * If no access modifier is specified it is default
 * It can be accessed only within the same Package
 * 
 * Access modifiers  same_class  same_package  other_package_subclass  other_package
 * 
 *    public           yes          yes                yes                 yes
 *   protected         yes          yes                yes                  no
 *    Default          yes          yes                no                   no
 *    private          yes          no                 no                   no
 */
package AccessModifiers_08;
//public
/**public class AccessModifier {
    public void display(){
        System.out.println("public");
    }
}
*/

//private
/**public class AccessModifier {
 private void display(){
    System.out.println("Private");
 }
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.display();
    }
}
*/

//protected
/**public class AccessModifier {
 protected void display(){
    System.out.println("Protected");
 }
}
*/

//Default
public class AccessModifier {
  void display(){
    System.out.println("Default");
 }
}