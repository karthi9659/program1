import java.util.*;
class Mul7
{
  static boolean isMultipleof7(int n)
  {
    while(n>0)
    n=n-7;
    if(n==0)
    return true;
    return false;
  }
  public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    if(isMultipleof7(n)==true)
    System.out.println(" is Multiple of 7"+n);
    else
    System.out.println(" is not multiple of 7"+n);
  }
}
 
