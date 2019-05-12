import java.util.Scanner;
class EvenorOdd69
{
  public static void main(String args[])
  {
    int num,num1;
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    num1=s.nextInt();
    int sum=num+num1;
    if(sum%2==0)
    System.out.println("Entered number is even");
    else
    System.out.println("Entered number is odd");
  }
}  
