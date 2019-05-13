import java.util.*;
class LCM88
{
  public static void main(String args[])
  {
    int n,n1,GCD=0,LCM=0;
    Scanner s=new Scanner(System.in);
    int x=n=s.nextInt();
    int y=n1=s.nextInt();
    while(n1!=0)
    {
      if(n>n1)
      {
        n=n-n1;
      }
      else
      {
        n1=n1-n;
      }
      GCD=n;
      LCM=(x*y)/GCD;
      System.out.println(LCM);
    }
  }
}  
    
