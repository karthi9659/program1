import java.util.Scanner;
public class Even
{
  public static void main(String args[])
  {
    int n=0,i=0;
    Scanner y=new Scanner(System.in);
    System.out.println("Enter value n");
    n=y.nextInt();
    for(i=1;i<n;i++)
    {
      if(i%2==0)
      System.out.println(i+" ");
    }
    System.out.println();
  }  
}  
