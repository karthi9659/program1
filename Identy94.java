import java.util.Scanner;
class Identy94
{
  public static void main(String args[])
  {
    int n,x;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    x=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    System.out.print(arr[x-1]);
  }
}  
