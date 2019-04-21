import java.util.*;
public class Swapbit
{
  public static void main(String args[])
  {
    int num1,num2;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number=");
    num1=s.nextInt();
    System.out.println("Enter the second number=");
    num2=s.nextInt();
    num1=num1^num2;
    num2=num1^num2;
    num1=num1^num2;
    s.close();
    System.out.println("The first number after swapping="+num1);
    System.out.println("The second number after swapping="+num2);
  }
}  
    
