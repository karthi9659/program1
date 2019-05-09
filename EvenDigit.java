import java.util.*;
public class EvenDigit
{
  static int checkDigits(int n)
  {
    while(n>0)
    {
      if(((n%10)%2)>0)
      return 0;
      n/=10;
    }
    return 1;
  }
  static int largestNumber(int n)
  {
    for(int i=n;;i--)
    if(checkDigits(i)>0)
    return i;
  }
  static public void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println(largestNumber(n));
  }
}  
    
