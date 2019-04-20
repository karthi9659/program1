import java.util.Scanner;
public class Multiple
{
  public static void main(String args[])
  {
    int n;
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    int multifound=0;
    int currentnum=1;
    do
    {
      if(currentnum%n==0)
      {
        multifound++;
        System.out.println("found multiple of n:"+currentnum);
      }
      currentnum++;
    }
    while(multifound<5);
  }
}
       
