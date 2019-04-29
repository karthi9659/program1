import java.util.Scanner;
public class Hello2
{
  public static void main(String args[])
  {
    int n;
    String str;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    str=s.nextLine();
    for(int i=0;i<n;i++)
    {
      System.out.println(str+" ");
    }
  }
}  
