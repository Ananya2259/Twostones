import java.util.*;
public class Two{
  public static void main(String []args){
  Scanner kbd = new Scanner(System.in);
  int N = kbd.nextInt();
  if((N <=10000000) && (N >= 1))
  {
    if(N%2==0)
    {
      System.out.print("bob");
    }
    else
       System.out.print("Alice");
  }
}
}