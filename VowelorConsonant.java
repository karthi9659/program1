import java.io.*;
import java.util.Scanner;
public class VowelorConsonant
{
  public static void main(String args[])
  {
    System.out.println("Enter the Character")
    Scanner vc=new Scanner(System.in);
    char ch=vc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
    {
      System.out.println("The character is vowel");
    }
    else
    {
      System.out.println("The character is Consonant");
    }
  }
}  
