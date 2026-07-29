//Looping Statement:
/** A Looping Statement is used to execute a block of code repeatedly until a Condition becames false
 * 
 * Types:
 *  1.for loop:(Entry Controlled loop)
 *    used when the number of iterations is known
 *    Syntax:
 *    for(initialization;Condition:Increment/Decrement){ }
 * 
 *  2.while loop:(Entry Controlled loop)
 *    Run while the Condition is true
 *    Syntax:
 *    Initialization;
 *    while(Condition){
 *     Increment/Decrement;
 *   }
 *   
 *  3.do-while loop:(Exit Controlled loop)
 *    Executes the code at least once, then checks the Condition
 *    Syntax:
 *    do{
 *     Increment/Decrement;
 * }while(condition)
 * 
 *  4.for each loop:(Enhanced for loop)
 *    used to access each element of an array or collection one by one
 *    Syntax:
 *    for(dataType variable:Arrayname){ }
*/
public class LoopingStatement{
    public static void main(String[] args) {
    System.out.println("for loop:");
    for(int i=0;i<=5;i++){
        System.out.println(i);
    }

    System.out.println("while loop:");
    int a=0;
    while (a<=5) {
        System.out.println(a);
        a++;
    }

    System.out.println("do-while loop:");
    int b=0;
    do{
        System.out.println(b);
        b++;
    }while(b<=5);

    System.out.println("for each loop:");
    int[] number = {1,2,3,4,5,6};
    for(int n :number){
        System.out.println(n);
    }
  }
}
