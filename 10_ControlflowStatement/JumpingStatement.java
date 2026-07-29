//JumpingStatement
 /**A Jumping Statement is used to change the normal flow of program execution
  * 
    Types:
    1.break:
      used to exit a loop or switch immediately

    2.continue:
     used to skip the current iteration and continue with the next one

    3.return:
     used to exit from a method and optionally return a value

*/

public class JumpingStatement {
    public static int method(int a,int b){//return
        return a+b;
    }
  public static void main(String[] args) {
    System.out.println("break:");
    //for
    for(int i=1;i<=5;i++){
        if(i==3){
            break;
        }
        System.out.println(i);
    }

    //switch
    int day=2;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        default:
            System.out.println("Invalid");
            break;
    }

    System.out.println("continue:");
    for(int i=1;i<=5;i++){
        if(i==3){
            continue;
        }
        System.out.println(i);
    }

    System.out.println("return:");
    int result=method(20,30);
    System.out.println(result);
  }
    
}
