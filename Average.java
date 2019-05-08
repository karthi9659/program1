import java.util.Scanner;
public class Average
{
  public static void main(String args[])
  {
    int num1,num2,num3,num4,num5;
    Scanner s=new Scanner(System.in);
    System.out.println("1st number:");
    num1=s.nextInt();
    System.out.println("2nd number:");
    num2=s.nextInt();
    System.out.println("3rd number");
    num3=s.nextInt();
    System.out.println("4th number:");
    num4=s.nextInt();
    System.out.println("5th number:");
    num5=s.nextInt();
    System.out.println("The Average values is:"+(num1+num2+num3+num4+num5)/5);
  }
}  
    
    
