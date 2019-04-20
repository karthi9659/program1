import java.util.Scanner;
public class Numeric
{
  public static void main(String args[])
  {
    String string;
    boolean numeric=true;
    Scanner s=new Scanner(System.in);
    string=s.nextInt();
    numeric=string.matches("-?\\d+(\\.\\d+)?");
    if(numeric)
    System.out.println(string+" is a number");
    else
    System.out.println(string+" is not a number");
  }
}  
    
