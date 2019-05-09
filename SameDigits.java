import java.util.Scanner;
public class SameDigits
{
  public static void main(String args[])
  {
    int n;
    System.out.println("Input");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    SameDigits sd=new SameDigits();
    sd.recursion(n);
  }
  public static void recursion(int n)
  {
    if(n>0)
    {
      recursion(n/10);
      System.out.print(" "+(n%10));
    }
  }  
}  
