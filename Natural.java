import java.util.Scanner;
public class Natural
{
  public static void main(String args[])
  {
    int num,count,total=0;
    System.out.println("Enter the value N");
    Scanner s3=new Scanner(System.in);
    num=s3.nextInt();
    s3.close();
    for(count=1;count<=num;count++)
    {
      total=total+count;
    }
    System.out.println("sum of first"+num+"natural number is:"+total);
  }
}  
