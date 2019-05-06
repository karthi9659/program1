import java.util.Scanner;
public class Numericdigit
{
  private static Scanner sc;
  public static void main(String args[])
  {
    int number,count=0;
    System.out.println("Enter a given number");
    sc=new Scanner(System.in);
    number=sc.nextInt();
    while(number>0)
    {
      number=number/10;
      count=count+1;
    }
    System.out.println("number of digit in a given number="+count);
  }
}  
  
