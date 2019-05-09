import java.io.*;
import java.util.*;
class Sumcalc
{
  public static void main(String args[])
  {
    int n,d;
    int sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(n!=0)
    {
      d=n%10;
      sum=sum+d;
      n=n/10;
    }
    System.out.println(sum);
  }
}  
    
