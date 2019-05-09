import java.util.*;
class AlphaDigit
{
  public static boolean isAlphaDigit(String s)
  {
    return s!=null&&s.matches("^[a-zA-z0-9]*$");
  }
  public static void main(String[] args)
  {
    String s;
    Scanner s1=new Scanner(System.in);
    s=s1.nextLine();
    System.out.println("isAlphaDigit:"+isAlphaDigit(s));
  }
}  

    
