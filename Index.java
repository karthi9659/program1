import java.util.*;
public class Index
{
  public static void main(String args[])
	{
	  int arr[]={10,14,16,17,3,114,79,54,32,22,18,79};
		int i;
		System.out.println("Enter the number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for(i=0;i<arr.length;i++)
		{
		  if(num==arr[i])
			{
			  System.out.println("Index is:="+(i+1));
			  break;
			}
	  }
	}
}	
	
		
		
