import java.util.Scanner;
public class Findsum
{
  public static void main(String args[])
  {
    int num1,num2,sum;
    Scanner s=new Scanner(System.in);
    System.out.println("1st number");
    num1=s.nextInt();
    System.out.println("2nd number");
    num2=s.nextInt();
    sum=num1+num2;
    System.out.println("Sum"+sum);
  }
}  
