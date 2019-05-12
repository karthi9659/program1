package  com.javaq2novice.algos;
import java.util.*;
public class Binarynum62
{
  public boolean isBinaryNumber(int binary)
  {
    boolean status=true;
    while(true)
    {
      if(binary==0)
      {
        break;
      }
      else
      {
        int tmp=binary%10;
        if(tmp>1)
        {
          status=false;
          break;
        }
        binary=binary/10;
      }
    }
    return status;
  }
  public static void main(String args[])
  {
    int n;
    MyBinaryCheck mbc=new MyBinaryCheck();
    System.out.println("is Binary:"+mbc.isBinaryNumber(n));
  }  
}  
