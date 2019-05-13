import java.util.*;
class Numstr90
{
  public static void main(String args[])
  {
    String s;
    Scanner s1=new Scanner(System.in);
    s=s1.next();
    char c[]=s.toCharArray();
    for(int i=0;i<c.length;i++)
    {
      if(Character.isDigit(c[i]))
      {
        System.out.print(c[i]);
      }
    }
  }
} 
