import java.util.*;
class Sum92
{
  public static void main(String args[])
  {
    int n,sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
      sum+=arr[i];
    }
    System.out.println(sum);
  }
}  
    
