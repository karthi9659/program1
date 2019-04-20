import java.util.Scanner;
public class Countword
{
  static int Countword(String string)
  {
    int count=0;
    char ch[]=new char[string.length()];
    for(int i=0;i<string.length();i++)
    {
      ch[i]=string.charAt(i);
      if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0)))
      count++;
    }
    return count;
  }
  public static void main(String args[])
  {
    String string;
    Scanner s=new Scanner(System.in);
    string=s.nextLine();
    System.out.println(Countword(string)+"words.");
  }
}  
