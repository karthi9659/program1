import java.util.*;
public class OddEven
{
  public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of element");
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the all the element");
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    System.out.println("Odd number");
    for(int i=0;i<n;i++)
    {
      if(a[i]%2!=0)
      {
        System.out.println(a[i]+" ");
      }
    }
    System.out.println(" ");
    System.out.println("Even Number");
    for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
      {
        System.out.println(a[i]+" ");
      }
    }
  }
}  
 
 
   
