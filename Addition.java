import java.io.*;
import java.util.Scanner;
public class Addition
{
  public static void main(String args[])
  {
    int n,add,res=0;
    int a[]=new int[5];
    System.out.println("Enter the Input");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    add=s.nextInt();
    for(int i=0;i<=n;i++)
    {
      a[i]=s.nextInt();
    }
    for(int i=0;i<add;i++)
    {
      res=res+a[i];
    }
    System.out.println(res+" ");
  }
}  
