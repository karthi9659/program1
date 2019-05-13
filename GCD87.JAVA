import java.lang.*;
import java.util.*;
class GCD87
{
  public static void main(String args[])
  {
    int x,y,sum=0;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();
    int n=Math.min(x,y);
    for(int i=1;i<=n;i++)
    {
      if(x%i==0&&y%i==0)
      {
        sum=i;
      }
    }
    System.out.println(sum);
  }
}  
