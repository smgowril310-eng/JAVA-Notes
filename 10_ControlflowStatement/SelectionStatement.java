//Controlflow Statement: (decision statement)
 /** Control flow statements are used to control the flow of Program execution
  * 
  *Types:
     1.Selection Statement:
        A Selection Statement is used to choose one block of code from multiple options based on a condition
        Types:
        1.if:
          used to execute a block of code only if condition is true
           Syntax:
            if(condition){ }

        2.if-else:
        used to choose between two conditions
        Systax:
        if(condition){ }
        else{ }

        3.else-if ladder(if-else-if):
          An else if ladder is used to check multiple conditions
          The first condition that is true will be executed and the remaining conditions will be skipped
          Syntax:
          if(condition 1){}
          else if(condition 2){}
          else if(condition 3){}
          else{}

        4.nested if:(nested decision statement)
        An if Statement inside another if statement
        Syntax:
        if(condition 1){
        if(condition 2){
        }}
         
        5.Switch:(Multi way selection statement)
          used to select one option from multiple choices
          Syntax:
          switch(condition){
           case n:System.out.println();
           break;
           default:System.out.println();
           }
  */

public class SelectionStatement {
    public static void main(String[] args) {
        int age = 20;
        System.out.println("if:");
        //if
        if(age>=18){
            System.out.println("Eligible");
        }
        
        System.out.println("if-else:");
        //if-else
        if (age>=18) {
           System.out.println("Eligible"); 
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("else-if-ladder:");
        //else-if ladder
        if(age<13){
            System.out.println("Child");
        }
        else if(age<20){
            System.out.println("Teenager");
        }
        else if(age<60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior Citizen");
        }

        //Nested-if
        System.out.println("Nested-if:");
        boolean VoterId = true;
        if(age>=18){
            if(VoterId){
                System.out.println("Can Vote");
            }
        }

        //Switch
        System.out.println("Switch:");
        int day=1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
               System.out.println("Invalid");
                break;
        }
    }
    
}
