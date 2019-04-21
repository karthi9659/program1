import java.util.*;
public class Swap
{
  public static void main(String args[])
  {
    float first,second;
    Scanner s=new Scanner(System.in);
    first=s.nextInt();
    second=s.nextInt();
    System.out.println("____Before swap___");
    System.out.println("First Number="+first);
    System.out.println("Second Number="+second);
    first=first-second;
    second=first+second;
    first=second-first;
    System.out.println("--After Swap---");
    System.out.println("First Number="+first);
    System.out.println("second Number="+second);
  }
}  
 
