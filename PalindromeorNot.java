import java.util.Scanner;
class PalindromeorNot
{
  public static void main(String args[])
  {
    String original,rev="";
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number check the palindrome or not");
    original=in.nextLine();
    int length=original.length();
    for(int i=length-1;i>=0;i--)
    rev=rev+original.charAt(i);
    if(original.equals(rev))
    System.out.println("The string is a palindrome");
    else
    System.out.println("The String is not Polindrome");
  }
}  
    
