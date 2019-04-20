import java.util.*;
public class Largestnum
{
  public static void main(String args[])
  {
    int n,max;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of element");
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter number of element");
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    max=a[0];
    for(int i=0;i<n;i++)
    {
      if(max<a[i])
      {
        max=a[i];
      }
    }
    System.out.println("Mzximum Value:"+max);
  }
}  
  
