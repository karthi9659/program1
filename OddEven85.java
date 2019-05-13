import java.util.*;
public class OddEven85
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String s1=s.next();
    char ch[]=s1.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      System.out.println(ch[i]);
      i++;
    }
    System.out.print(" ");
    for(int i=0;i<ch.length;i++)
    {
      System.out.print(ch[i]);
      i++;
    }
  }
}
    
