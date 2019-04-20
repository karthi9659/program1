import java.util.Scanner;
class CountSpace
{
  public static void main(String args[])
  {
    int word=1;
    String str;
    Scanner s=new Scanner(System.in);
    str=s.nextLine();
    for(int i=0;i<str.length();++i)
    {
      if(str.charAt(i)==' ')
      word++;
    }
    System.out.println("Number of Spaces="+(word-1));
  }
}  
