import java.util.Scanner;
class Concat
{
  public static void main(String args[])
  {
    String str1,str2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st string");
    str1=sc.nextLine();
    System.out.println("Enter the second string");
    str2=sc.nextLine();
    System.out.println("Concatenated string is");
    System.out.println(str1+str2);
  }
}  
