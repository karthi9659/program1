class Numfound
{
  void printRepeating(int arr[],int size)
  {
    int i;
    System.out.println("The repeating elements are:");
    for(i=0;i<size;i++)
    {
      if(arr[Math.abs(arr[i])]>0)
      arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
      else
      System.out.println("Yes");
    }
  }
  public static void main(String args[])
  {
    int i;
    Numfound repeat=new Numfound();
    int arr[]={1,1,2,3,4,4,5,6,7,8};
    int arr_size=arr.length;
    repeat.printRepeating(arr, arr_size);
  }
}  
  
