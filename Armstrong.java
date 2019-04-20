import java.util.Scanner;
public class Armstrong
{
  public static void main(String args[])
  {
    int num,onum,rem,result=0;
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    onum=num;
    while(onum!=0)
    {
      rem=onum%10;
      result +=Math.pow(rem,3);
      onum/=10;
    }
    if(result==num)
      System.out.println(num+ "is an armstrong");
    else
      System.out.println(num+ "is not an armstrong");
  }
}  
