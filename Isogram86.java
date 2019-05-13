import java.util.*;
class Isogram86
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String s1=s.next();
    char c[]=s1.toCharArray();
    int flag=0;
    for(int i=0;i<c.length;i++)
    {
      for(int j=0;j<i;j++)
      {
        if(c[j]==c[i])
        {
          flag=1;
        }
      }
    }
    if(flag==0)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}  
      
