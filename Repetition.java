import java.util.*;
public class Repetition
{
  public static void main(String args[])throws Exception
  {
    int[] arr=new int[10];
    Scanner s=new Scannner(System.in);
    int [] result=new int[10];
    int counter=0,count=0;
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=s.nextInt();
      boolean isDistinct=false;
      for(int j=0;j<i;j++)
      {
        if(arr[i]==arr[j])
        {
          isDistinct=true;
          break;
        }
      }
      if(!isDistinct)
      {
        result[counter++]=arr[i];
      }
    }
    for(int i=0;i<counter;i++)
    {
      count=0;
      for(int j=0;j<arr.length;j++)
      {
        if(result[i]==arr[j])
        {
          count++;
        }
        System.out.println(result[i]+"="+count);
      }
    }
  } 
}  
    
