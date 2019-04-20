import java.util.*;
public class CountLine
{
  public static int CountLine(String text)
  {
    return text.split("[\n|\r]").length;
  }
  public static void main(String args[])
  {
    String str;
    Scanner s=new Scanner(System.in);
    str=s.nextLine();
    System.out.println(str);
    int count=CountLine(str);
    System.out.println("Line count:"+count);
  }
}  
