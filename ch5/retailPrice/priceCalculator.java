import java.util.Scanner;
public class priceCalculator{
  public static void main(String []args){
  Scanner stdin = new Scanner(System.in);
  System.out.println("input the wholesale cost");
  double cost = stdin.nextDouble();
  System.out.println("input the markup percent");
  double markup = stdin.nextDouble();
  
  System.out.println("the retail price is $" +calculateRetail(cost,markup));
  }
  public static double calculateRetail(double _cost, double _markup){
  return _cost +_cost*_markup/100;
  }
}