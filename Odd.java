import java.util.Scanner;
public class Odd
{
  public static void main(String args[])
  {
    int n=0,i=0;
    Scanner x=new Scanner(System.in);
    System.out.println("Enter value n:");
    n=x.nextInt();
    for(i=1;i<n;i++)
    {
      if(i%2!=0)
      System.out.println(i+" ");
    }
    System.out.println();
  }
}
