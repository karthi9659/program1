import java.util.*;
class Mul13
{
  static boolean isMultipleof13(int n)
  {
    while(n>0)
    n=n-13;
    if(n==0)
    return true;
    return false;
  }
  public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    if(isMultipleof13(n)==true)
    System.out.println("is Multiple of 13"+n);
    else
    Syste.out.println("is not multiple of 13"+n);
  }
}  
