import java.util.*;
public class Timefor
{
  int seconds;
  int minutes;
  int hours;
  public Timefor(int hours,int minutes,int seconds)
  {
    this.hours=hours;
    this.minutes=minutes;
    int secomds=seconds;
  }
  public static void main(String args[])
  {
       Timefor start=new Timefor(12,15,24), stop=new Timefor(10,05,55),diff;
    diff=difference(start,stop);
    System.out.printf("Time Difference:%d:%d-",start.hours,start.minutes);
    System.out.printf("%d:%d",stop.hours,stop.minutes);
    System.out.printf("=%d:%d\n",diff.hours,diff.minutes);
  }
  public static Timefor difference(Timefor start,Timefor stop)
  {
    Timefor diff=new Timefor(0,0,0);
    if(stop.seconds>start.seconds)
    {
    --start.hours;
    start.minutes +=60;
  }
    diff.minutes=start.minutes-stop.minutes;
    diff.hours=start.hours-stop.hours;
    return(diff);
  }
}  
      
    
   
