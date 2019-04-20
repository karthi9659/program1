import java.util.Scanner;
public class ArmInterval
{
  public static void main(String args[])
  {
    int n,n1,n2,i,rem,temp,count=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Interval");
    System.out.println("Enter the starting number");
    n1=scan.nextInt();
    System.out.println("Enter the Ending number");
    n2=scan.nextInt();
    for(i=n1+1;i<n2;i++)
    {
      temp=1;n=0;
      while(temp!=0)
      {
        rem=temp%10;
        n=n+rem*rem*rem;
        temp=temp/10;
      }
      if(i==n)
      {
        if(count==0)
        {
          System.out.println("The given number is armstrong");
        }
        System.out.println(" ");
        count++;
      }
    }
    if(count==0)
    {
      System.out.println("The given number is not armstrong number");
    }
  }  
 }       
