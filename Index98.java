import java.util.Scanner;
class Index98
{
  public static void main(String args[])
  {
    int n,find=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int k=0;k<n-1;k++)
    {
      if(arr[k]>arr[k+1])
      {
        find=k-1;
        k=n-1;
      }
    }
    System.out.print(arr[find]);
  }
}  
