import java.util.*;
public class Odd80
{
  public static void main(String args[])
  {
     int a[]=new int[20];
     Scanner s=new Scanner(System.in);
     for(int i=0;i<a.length;i++)
     {
       a[i]=s.nextInt();
       if(a[i]%2!=0)
       System.out.println(a[i]+" ");
     }
   }
 }  
