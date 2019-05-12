import java.util.*;
public class Perfact79
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Input a positive integer");
    int n=in.nextInt();
    int n1=in.nextInt();
    int sum=n+n1;
    System.out.println(" Is the said number perfact square"+is_Perfact_Square(sum));
  }
  public static boolean is_Perfact_Square(int sum)
  {
    int x=sum%10;
    if(x==2||x==3||x==7||x==8)
    {
      return false;
    }
    for(int i=0;i<=sum/2+1;i++)
    {
      if((long)i*i==sum)
      {
        return true;
      }
    }
    return true;
  }
}
