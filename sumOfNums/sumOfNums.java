import java.util.Scanner;
public class sumOfNums{
  public static void main(String []args){
  Scanner stdin = new Scanner(System.in);
    System.out.println("import number to find the sum of");
   int top = stdin.nextInt();
   int sum = 0;
   for(int i = 0; i <= top; i++)
   {
   sum += i;
   }
    System.out.println("the sum is " +sum);
  }}