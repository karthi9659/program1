import java.util.Scanner;
public class Cuboidpro91
{
  public static void main(String args[])
  {
     int l,w,h,vol;
     Scanner s=new Scanner(System.in);
     l=s.nextInt();
     w=s.nextInt();
     h=s.nextInt();
     int totalsurarea=2*(l*w+w*h+h*l);
     System.out.println(totalsurarea);
     vol=l*w*h;
     System.out.println(" ");
     System.out.println(vol);
  }
}  
 
