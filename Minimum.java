import java.util.Scanner;
public class Minimum
{
  public static void main(String args[])
  {
    int n,min;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of element");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the element in array");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]>a[j])
        {
          min=a[i];
          a[i]=a[j];
          a[j]=min;
        }
      }
    }
    System.out.println("The smallest array element is:"+a[0]);
  }
}  
      
