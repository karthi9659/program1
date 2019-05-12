import java.util.*;
public class Powerof2
{
  private static Scanner sc;
  public static void main(String args[])
  {
    int num,i,exp;
    long power=0;
    sc=new Scanner(System.in);
    num=sc.nextInt();
    exp=sc.nextInt();
    for(i=1;i<=exp;i++)
    {
      power=power+num;
    }
    System.out.println("The result is"+num+"power"+exp+"="+power);
  }
}  
