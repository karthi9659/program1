import java.util.Scanner;
public class PrimeNum
{
  public static void main(String args[])
  {
    int low,high;
    Scanner s=new Scanner(System.in);
    low=s.nextInt();
    high=s.nextInt();
    while(low <high)
    {
      boolean flag=false;
      for(int i=2;i<=low/2;++i)
      {
        if(low%i==0)
        {
        flag=true;
        break;
      }
    }
    if(!flag)
      System.out.println(low+" ");
      ++low;
    }
  }
}  
