import java.util.Scanner;
public class shippingCharges{
  public static void main(String[] args){
  Scanner stdin = new Scanner(System.in);
  System.out.println("how heavy is the package? (lbs) ");
  int weight = stdin.nextInt();
  double rate =0;
  if (weight <= 2)
    rate =1.1;
  if(weight > 2 && weight <=6)
    rate = 2.2;
  if(weight > 6 && weight <= 10)
    rate = 3.70;
  if(weight > 10)
    rate = 3.8;
  System.out.println("it will cost you $"+rate+" to ship your package per 500 miles.");
  
  }}