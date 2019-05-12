import java.util.*;
class Nearmul10
{
  static int round(int n)
  {
    int a=(n/10)*10;
    int b=a+10;
    return(n-a>b-n)?b:a;
  }
  public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println(round(n));
  }
}  
