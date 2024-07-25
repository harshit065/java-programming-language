import java.util.*;
public class conditionalstatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int age = 22;
        // if(age >= 18){
        //     System.out.println("adult vote"); 

        // }
        // else{
        //     System.out.println("not adult");
        // }   

        //IF ELSE STATEMENT 

       /*
        *  int age = 13;

        if(age >= 18){
            System.out.println("adult");
        }
        else if(age>=13 && age <18){
            System.out.println("teeneagrer"); // ELSE IF STATEMENT
        }
        else{
            System.out.println("child");
        }
        */
        // int income = sc.nextInt();
        // int tax;

        // if(income <500000){
        //     tax = 0;
        // }
        // else if(income <500000 && income>1000000){
        //     tax = (int)(income * 0.2);
        // }
        // else{
        //     tax = (int) (income* 0.3);
        // }
        // System.out.println("your tax is :" + tax);

        // int number = 4;
        // String type = ((number%2) == 0)? "even":"odd"; //Teneary operator
        // System.out.println(type);

        // int marks = 45;
        // String Rc = ((marks>=33)? "pass":"fail");
        // System.out.println(Rc);


        //SWITCH STATEMENT

        // int number =2;
        // switch(number){
        //     case 1:System.out.println("Samosa");
        //     break;
        //     case 2:System.out.println("cake");
        //     break;
        //     case 4:System.out.println("mango shake");
        //     break;
        //     default:System.out.println("we wake up");

        System.out.println("enter a :");
        int a =sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        System.out.println("enter operator:");
        char operator = sc.next().charAt(0);

        switch(operator){
            case'+': System.out.println(a+b);
            break;
            case'-': System.out.println(a-b);
            break;
            case'*': System.out.println(a*b);
            break;
            case'/': System.out.println(a/b);
            break;
            case'%': System.out.println(a%b);
            break;
            default: System.out.println("wrong operator");
        }
        }
     }

