import java.util.Scanner;
class Minamong63
{
  public static void main(String args[])
  {
    Scanner data=new Scanner(System.in);
    int num,i,temp,small;
    System.out.print("Enter number you want to enter");
    num=data.nextInt();
    System.out.println("Enter "+num+"number");
    small=data.nextInt();
    for(i=0;i<num;i++)
    {
      temp=data.nextInt();
      if(temp>small)
      continue;
      else
      small=temp;
    }
    System.out.println("Smallest number is"+small);
  }
}  
    
