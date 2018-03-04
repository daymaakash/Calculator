import java.util.Scanner;
class Calculator
{
 public static void main(String arr[])
{
 Scanner s = new Scanner(System.in);
 System.out.print("enter first number :");
 int a = s.nextInt();
 System.out.print("enter second number :");
 int b = s.nextInt();
 System.out.print("menu : enter '1' for addition\n enter '2' for sub\n enter '3' for product\n enter '4' for divide\n choice = ");
 int c = s.nextInt();
 switch(c)
{
 case 1 : System.out.println("addition of number is :"+(a+b));

 case 2 : System.out.println("sub of number is :"+(a-b));

 case 3 : System.out.println("product of number is :"+(a*b));
 
 case 4 : System.out.println("division of number is :"+(a/b));
 
 default : System.out.println("invalid choice");
}
}
}