import java.util.Scanner;
public class PowerofNumber
{
  public static void main(String args[])
  {
    Scanner sr=new Scanner(System.in);
    System.out.println("Enter the base number:");
    int base=sr.nextInt();
    int temp=base;
    System.out.println("Enter the exponent number:");
    int exp=sr.nextInt();
    for(int i=1;i<exp;i++)
    {
      temp=temp*temp;
    }
    System.out.println("Result of"+base+"power"+exp+"is "+temp);
  }
}  
