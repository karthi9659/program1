import java.io.*;
class OddorEven
{
  public static void main(String args[])
  {
    int x;
    Scanner s2=new Scanner(System.in);
    x=s2.nexrInt();
    System.out.println("Enter The Number");
    if(x%2==0)
    {
      System.out.println("The given number is ODD");
    }  
    else
    {
      System.out.println("The given number is EVEN");
    }
  }
}  
