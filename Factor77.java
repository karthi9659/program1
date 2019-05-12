import java.util.*;
public class Factor77
{
  public static void main(String args[])
  {
    int num;
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    System.out.println("Factors of"+num+"are:");
    for(int i=1;i<=num;++i)
    {
      if(num%i==0)
      {
        System.out.print(i+" ");
      }
    }
  }
}  
