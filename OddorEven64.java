import java.util.Scanner;
class OddorEven64
{
  public static void main(String args[])
  {
    int num,num1,sum;
    System.out.println("Enter an Integer number");
    Scanner input=new Scanner(System.in);
    num=input.nextInt();
    num1=input.nextInt();
    sum=num+num1;
    if(sum%2!=0)
    System.out.println("Entered number is Odd");
    else
    System.out.println("Entered number is Even");
  }
}  
