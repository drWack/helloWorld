import java.util.Scanner;
public class largestSmallest{
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
  int largest = 0;
  int smallest = 0;
  int curr=0;
  System.out.println("input numbers to find the smallest and largest number, input -99 to finish");
  while(curr != -99)
  {
  curr = stdin.nextInt();
  if(curr > largest && curr != -99)
    largest = curr;
  if(curr < smallest && curr != -99)
    smallest = curr;
  }
  System.out.println("largest number was " +largest+ "\n smallest number was "+ smallest);
  }}