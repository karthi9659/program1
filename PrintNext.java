import java.util.Scanner;
public class PrintNext
{
  public static void main(String args[])
  {
    int num,count;
    System.out.println("Enter the number");
    Scanner s=new Scanner(System.in);
    count=s.nextInt();
    num=count;
    count=num+1;
    System.out.println("The next number is="+count);
  }
}  
