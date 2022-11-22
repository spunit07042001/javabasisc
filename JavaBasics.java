import java.util.*;

public class JavaBasics {

public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a= sc.nextInt();

        System.out.println("enter b:");
        int b= sc.nextInt();

        System.out.println("enter operator:");
        
        char operator= sc.next().charAt(0);
        


        switch(operator)
        {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;

            default :System.out.println("wrong operator");
        }
    

}
}

// find the kargest number

// public static void main(String args[]){
// // Scanner sc= new Scanner(System.in);

// int a=1, b=3 ,c=6;

// if((a>=b) && (a>=c))
// {
// System.out.print("A");
// }
// else if(b>=c)
// {
// System.out.print("B");

// }
// else
// {
// System.out.print("C");
// }
// }

// income tax calculator

// {
// Scanner sc = new Scanner (System.in);

// int income = sc.nextInt();
// int tax;

// if(income<500000)
// {
// tax=0;
// }
// else if(income>500000 && income<=1000000)
// {
// tax=(int) (income*0.2);
// }
// else{
// tax=(int) (income*0.3);
// }
// System.out.println("your tax is:" + tax);
// }

// even and odd print value code

// Scanner sc =new Scanner(System.in);
// int n = sc.nextInt();

// if(n%2==0)
// {
// System.out.println("Even");
// }
// else
// {
// System.out.println("Odd");
// }
// }

// System.out.print("Hello World!\n");
// System.out.println("****");
// System.out.println("***");
// System.out.println("**");
// System.out.println("*");

// {
// int age=16;
// if(age>=18)
// {
// System.out.println("adult: drive, vote");
// }
// if(age>13 && age<18)
// {
// System.out.println("teenager");
// }
// else{
// System.out.println("not adult");
// }
// }
// }

// {
// int a=10;
// int b=5;
// if(a>=b)
// {
// System.out.println("A");

// }
// else{
// System.out.println("B");
// }
// }
// }