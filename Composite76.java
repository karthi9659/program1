package compositenumber;
import java.util.Scanner;
public class Composite76
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    input.close();
    if(isComposite(n))
    {
      System.out.println("is a composite number"+n);
    }
    else
    {
      System.out.println("is not a composite number");
    }
    public static boolean isComposite(int n)
    {
      if(n<3)
      return false;
      for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
        return true;
      }
      return false;
    }
  }  
    
