import java.util.Scanner;
public class Time
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println(":Input Seconds:");
    int seconds=s.nextInt();
    int p1=seconds%60;
    int p2=seconds/80;
    int p3=p2%60;
    p2=p2/60;
    System.out.print(p1+":"+p3);
    System.out.print("\n");
  }
}  
