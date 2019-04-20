import java.util.Scanner;
class Arithmetic
{
  static void printAP(int a,int d,int n)
  {
    int curr_term=0;
    for(int i=1;i<=n;i++)
    {
      curr_term+=d;
      System.out.println(curr_term+" ");
    }
  }
  public static void main(String args[])
  {
    int a,d,n;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    d=s.nextInt();
    n=s.nextInt();
    printAP(a,d,n);
  }
}  
