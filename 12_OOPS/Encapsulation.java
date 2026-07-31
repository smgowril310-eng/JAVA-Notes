//Write only Encapsulation
/**public class Encapsulation {
    private String name;
    public void setName(String name){
        this.name=name;
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Gowri");
    }

}
*/

//Read only Encapsulation
/**public class Encapsulation {
  private String name;
  public String getName(){
    return name;
  }
  public static void main(String[] args) {
    Encapsulation obj = new Encapsulation();
    System.out.println(obj.getName());
  }
    
}
*/

//Read and write Encapsulation
public class Encapsulation {
 private String name;
 public void setName(String name){
    this.name=name;
 }
 public String getName(){
    return name;
 }
 public static void main(String[] args) {
    Encapsulation obj = new Encapsulation();
    obj.setName("Vedisamy");
    System.out.println(obj.getName());
 }
}