import java.util.Scanner;
class PowerofTwo
{
  static boolean isPowerOfTwo(int n)
  {
    if(n==0)
    return false;
    return(int)(Math.ceil((Math.log(n)/Math.log(2))))==
    (int)(Math.floor(((Math.log(n)/Math.log(2)))));
  }
  public static void main(String args[])
  {
    int x,y;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();
    if(isPowerOfTwo(x))
    System.out.println("Yes");
    else
    System.out.println("No");
    if(isPowerOfTwo(y))
    System.out.println("Yes");
    else
    System.out.println("No");
  }
}  
