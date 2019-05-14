import java.util.Scanner;
class AP96
{
  public static void main(String args[])
  {
    int a,b,c,sum=0;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    for(int i=0;i<c;i++)
    {
      sum=sum+a;
      a=a+b;
    }
    System.out.print(sum);
  }
}  
