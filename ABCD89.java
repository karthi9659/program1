import java.util.*;
class ABCD89
{
  public static void main(String args[])
  {
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.next();
    char c[]=s.toCharArray();
    Arrays.sort(c);
    for(int i=0;i<c.length;i++)
    {
      System.out.print(c[i]);
    }
  }
}  
