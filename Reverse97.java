import java.util.*;
class Reverse97
{
  public static void main(String args[])
  {
    int n,rev=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(n!=0)
    {
      int digit=n%10;
      rev=rev*10+digit;
      n=n/10;
    }
    System.out.print(rev);
  }
} 
