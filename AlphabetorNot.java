import java.util.Scanner;
public class AlphabetorNot
{
  public static void main(String args[])
  {
    char ch;
    System.out.println("Enter the Alphabet");
    Scanner scan=new Scanner(System.in);
    ch=scan.next().charAt(0);
    if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
    {
      System.out.println(ch+"is a Alphabet");
    }
    else
    {
      System.out.println(ch+"is not an Alphabet");
    }
  }
}  
    
