import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class Divandmadolo83
{
  public static void main(String args[])
  {
    double x;
    double y;
    double z;
    char a;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();
    a=s.next().charAt(0);
    switch(a)
    {
    case '+':
      z=x+y;
      System.out.println("%.0f"+z);
      break;
    case '-':
      z=x-y;
      System.out.println("%.0f"+z);
      break;
    case '/':
      z=x/y;
      System.out.println("%.0f"+z);
      break;
    case '%':
      z=x%y;
      System.out.println("%.0f"+z);
      break;
    }
  }
}  
  
